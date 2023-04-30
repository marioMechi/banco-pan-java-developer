package ApiRest;

import org.apache.catalina.Store;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;


@Configuration
public class LoadBD {
    private static final Logger log = (Logger) LoggerFactory.getLogger(LoadBD.class);
    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository employeerepository){
        return args -> {
            log.info("Log of event save user 1:"+ employeerepository.save(new Employee("Maria Silva", "Chef", "Avenida Silveira Dutra,1002")));
            log.info("Log of event save user 1:"+ employeerepository.save(new Employee("Joao Dutra","Mecanico","Rua Dutra, 231")));
        };
    }
}
