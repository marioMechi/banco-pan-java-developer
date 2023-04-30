package Hateoas.Exceptions;

public class OrderNotFoundExceptionHateoas extends RuntimeException {
    public OrderNotFoundExceptionHateoas(long id){
        super("Cloud not found the employee:"+ id);
    }
}
