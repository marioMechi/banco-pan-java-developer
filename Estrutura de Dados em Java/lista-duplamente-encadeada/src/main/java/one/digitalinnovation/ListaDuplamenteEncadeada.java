package one.digitalinnovation;

public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }
    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoproximo(null);
        novoNo.setNoprevio(ultimoNo);
        if(primeiroNo == null){
           primeiroNo = novoNo;
        }
        if(primeiroNo != null){
            ultimoNo.setNoproximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }
    public void add(int index, T elemento){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoprevio(noAuxiliar);

        if(novoNo.getNoproximo() != null){
            novoNo.setNoprevio(noAuxiliar.getNoprevio());
            novoNo.getNoproximo().setNoprevio(novoNo);
        }else{
            novoNo.setNoprevio(ultimoNo);
            ultimoNo = novoNo;
        }
        if(index == 0){
            primeiroNo = novoNo;
        }else{
            novoNo.getNoprevio().setNoproximo(novoNo);
        }
        tamanhoLista++;
    }
    public void remove(int index){
        if(index == 0){
            primeiroNo = primeiroNo.getNoproximo();
            if(primeiroNo != null){
                primeiroNo.setNoproximo(null);
            }
        }else{
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoprevio().setNoproximo(noAuxiliar.getNoproximo());
            if(noAuxiliar != ultimoNo){
                noAuxiliar.getNoproximo().setNoprevio(noAuxiliar.getNoprevio());
            }else{
                ultimoNo = noAuxiliar;
            }
        }
        this.tamanhoLista--;
    }
    public T get(int index){
        return this.getNo(index).getConteudo();
    }
    public NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;
         for (int i = 0; (i < index)&&(noAuxiliar != null); i++){
             noAuxiliar = noAuxiliar.getNoproximo();
         }
         return noAuxiliar;
    }
    public int size(){

        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; i< size(); i++){
            strRetorno += "[No{conteudo"+noAuxiliar.getConteudo()+"}]";
            noAuxiliar = noAuxiliar.getNoproximo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
