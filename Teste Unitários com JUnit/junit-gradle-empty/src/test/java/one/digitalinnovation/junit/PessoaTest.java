package one.digitalinnovation.junit;

import one.digitalinnovation.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {
    @Test
    void validarCalculoDeIdade(){
        Pessoa pessoa = new Pessoa("Joao", LocalDate.of(2001,1,1));
        Assertions.assertEquals(22, pessoa.getIdade());
    }
}
