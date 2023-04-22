package one.digitalinnovation.junit;

import one.digitalinnovation.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {
    @Test
    void testandoCalculodaIdadePessoa(){
        Pessoa pessoa = new Pessoa("Joao", LocalDate.of(2000,1,1));
        Assertions.assertEquals(23, pessoa.getIdade());
    }
    @Test
    void testandoSeEhMaiorDeIdade(){
        Pessoa pessoa = new Pessoa("Joao", LocalDate.of(2000,1,1));
        Assertions.assertTrue(pessoa.ehMaiorIdade());

        Pessoa pessoa2 = new Pessoa("Jessica", LocalDate.of(2020, 1,1));
        Assertions.assertFalse(pessoa2.ehMaiorIdade());
    }
}
