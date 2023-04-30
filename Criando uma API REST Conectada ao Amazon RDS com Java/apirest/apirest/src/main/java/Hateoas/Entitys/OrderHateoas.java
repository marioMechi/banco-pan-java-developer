package Hateoas.Entitys;


import jakarta.persistence.*;
import org.springframework.hateoas.RepresentationModel;


@Entity
@Table(name = "CUSTOMER_ORDER")
public class OrderHateoas extends RepresentationModel<OrderHateoas> {
    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Status status;
    private String description;

    public OrderHateoas(){
    }
    public OrderHateoas(Status status, String description){
        this.status = status;
        this.description = description;
    }
    public Long getId(){
        return this.id;
    }
}
