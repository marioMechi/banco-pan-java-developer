package one.digitalinnovation.junit;

import one.digitalinnovation.BandoDeDados;
import one.digitalinnovation.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosDePessoaTest {
    @BeforeAll
    static void configurarConexao(){
        BandoDeDados.iniciarConexao();
    }
    @BeforeEach
    void insereDadosParaTeste(){
        BandoDeDados.inserirDados(new Pessoa("Carlos", LocalDate.of(1990,1,1)));
    }
    @AfterEach
    void removeDadosDoTeste(){
        BandoDeDados.removerDados(new Pessoa("Carlos", LocalDate.of(1990,1,1)));
    }
    @Test
    void validarDadosDeRetorno(){
        Assertions.assertNull(null);
    }
    @AfterAll
    static void finalizarConexao(){
        BandoDeDados.finalizarConexao();
    }
}
