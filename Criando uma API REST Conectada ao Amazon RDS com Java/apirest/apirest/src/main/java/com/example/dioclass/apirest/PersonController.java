package com.example.dioclass.apirest;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PersonController {
    private final PersonRepository repositoryPerson;

    public PersonController(PersonRepository repositoryPerson) {
        this.repositoryPerson = repositoryPerson;
    }
    @GetMapping("/")
    //@RequestMapping(method = RequestMethod.GET)
    public String helloWorld(){
        return ("This is may first API Spring boot");
    }
    // estão expostos os métodos de reposição
    @GetMapping("/persons")
    public Person consultAllPersons(){
        return (Person) repositoryPerson.findAll();
    }
    @GetMapping("/persons/{id}")
    public Optional<Person> consultById(@PathVariable Long id){
        return repositoryPerson.findById(id);
    }
}
