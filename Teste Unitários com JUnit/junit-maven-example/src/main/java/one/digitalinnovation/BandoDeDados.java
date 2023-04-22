package one.digitalinnovation;

import java.util.logging.Logger;

public class BandoDeDados {
    public static final Logger LOGGER = Logger.getLogger(BandoDeDados.class.getName());
    public static void iniciarConexao(){
        //Fez algo
        LOGGER.info("Iniciou a conexão");
    }
    public static void finalizarConexao(){
        //Fez algo
        LOGGER.info("Finalizou a conexão");
    }
    public static void inserirDados(Pessoa pessoa){
        //insere pessoa no DB
        LOGGER.info("Inseriu Dados");
    }
    public static void removerDados(Pessoa pessoa){
        //insere pessoa no DB
        LOGGER.info("Removeu Dados");
    }
}
