package one.digitalinnovation.junit;

import one.digitalinnovation.Pessoa;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {
    @Test
    void validarLancamentos(){
        int[] primeiroLancamento = {10,20,30,40,50};
        int[] segundoLancameto = {-1,5,2,3,10};

        assertNotEquals(primeiroLancamento, segundoLancameto);
    }
    @Test
    void validarSeObjetoNulo(){
        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Lucas", LocalDate.of(1990,1,1));
        assertNotNull(pessoa);
    }
    @Test
    void validarNumerosDeTiposDIferentes(){
        double valor = 5.0;
        double valor2 = 5.0;

        assertEquals(valor, valor2);
    }
}
