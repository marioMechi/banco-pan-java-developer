package Hateoas;

import Hateoas.Entitys.OrderHateoas;
import Hateoas.Entitys.Status;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
public class LoadDBHateoas {
    private static final Logger log = (Logger) LoggerFactory.getLogger(Hateoas.LoadDBHateoas.class);
    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepositoryHateos employeerepositoryhateoas){
        return args -> {
            log.info("Log of event save user 1:"+ employeerepositoryhateoas.save(new EmployeeHateoas("Maria Silva", "Chef", "Avenida Silveira Dutra,1002")));
            log.info("Log of event save user 1:"+ employeerepositoryhateoas.save(new EmployeeHateoas("Joao Dutra","Mecanico","Rua Dutra, 231")));
        };
    }
    @Autowired
    CommandLineRunner loadOrder(OrdeRepositoryHateoas ordeRepositoryHateoas){
        return args -> {
            ordeRepositoryHateoas.save(new OrderHateoas(Status.COMPLETED, "review"));
            ordeRepositoryHateoas.save(new OrderHateoas(Status.IN_PROCESS, "sala"));
            ordeRepositoryHateoas.save(new OrderHateoas(Status.COMPLETED, "travel"));
            ordeRepositoryHateoas.findAll().forEach(order ->{
                log.info("Preload"+order);
            });
        };
    }
}