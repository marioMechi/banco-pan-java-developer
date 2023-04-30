package Hateoas.Controllers;

import Hateoas.Entitys.OrderHateoas;
import Hateoas.Entitys.Status;
import Hateoas.Exceptions.OrderNotFoundExceptionHateoas;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;

public class OrderControllerHateoas {
    private final OrderRepositoryHateoas repositoryOrder;

    public OrderControllerHateoas(OrderControllerHateoas repositoryHateoas){
        this.repositoryOrder = repositoryHateoas;
    }
    @GetMapping("/orders")
    ResponseEntity<List<OrderHateoas>> consultOrderAll(){
        long idOrder;
        Link linkUri;
        List<OrderHateoas> orderList = repositoryOrder.findAll();
        if (orderList.isEmpty()) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        for (OrderHateoas orderHateoas:orderList){
            idOrder = orderHateoas.getId();
            linkUri = linkTo(methodOn(OrderControllerHateoas.class).consultOneOrder(idOrder)).withSelfRel();
            orderHateoas.add(linkUri);
            linkUri = linkTo(methodOn(OrderControllerHateoas.class).consultOneOrder(idOrder)).withRel("Custumer Order");
            orderHateoas.add(linkUri);
        }
        return new ResponseEntity<List<OrderHateoas>>(orderList, HttpStatus.OK);
    }
    @GetMapping("/orders/{id}")
    ResponseEntity<List<OrderHateoas>> consultOneOrder(@PathVariable Long id){
        Optional<OrderHateoas> orderPointer = repositoryOrder.findById();
        if (orderPointer.isPresent()) {
            OrderHateoas order = orderPointer.get();
            order.add(linkTo(methodOn(OrderControllerHateoas.class).consultOrderAll)).withRel();
            return new ResponseEntity<>(HttpStatus.OK);
        }else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/orders/{id}")
    void deleteOrder(@PathVariable long id){
        repositoryOrder.deleteById(id);
    }
    @PutMapping("/orders/{id}/cancel")
    public ResponseEntity<?> cancelOrdersById(@PathVariable long id){
        OrderHateoas orderHateoas = repositoryOrder.findById(id).orElseThrow(()-> new OrderNotFoundExceptionHateoas(id));
        if(orderHateoas.getStatus() == Status.IN_PROCESS){
            orderHateoas.setStatus();
        }
    }
}
