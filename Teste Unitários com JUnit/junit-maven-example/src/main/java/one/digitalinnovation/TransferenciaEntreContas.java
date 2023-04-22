package one.digitalinnovation;

public class TransferenciaEntreContas {
    public void transfer(Conta contaOrigem, Conta contaDestino, int valor){
        if(valor <= 0 ){
            throw new IllegalArgumentException("valor deve ser maior que zero");
        }
    }
}
