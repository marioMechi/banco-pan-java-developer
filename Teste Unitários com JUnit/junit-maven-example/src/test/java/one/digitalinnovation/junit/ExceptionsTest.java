package one.digitalinnovation.junit;

import one.digitalinnovation.Conta;
import one.digitalinnovation.TransferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @Test
    void validaCenarioDeExcecacaoNaTransferencia(){
        Conta contaOrigem = new Conta("123456", 100);
        Conta contaDestino = new Conta("654321", 0);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();
        Assertions.assertThrows(IllegalArgumentException.class, ()->
                transferenciaEntreContas.transfer(contaOrigem, contaDestino, -1));
        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfer(contaOrigem, contaDestino, 10));
    }
}
