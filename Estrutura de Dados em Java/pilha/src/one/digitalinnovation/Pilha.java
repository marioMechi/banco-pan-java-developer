package one.digitalinnovation;

public class Pilha {
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }
    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }
    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
        }
        return null;
    }
    public No top(){
        return  refNoEntradaPilha = null;
    }
    public boolean isEmpty(){
 //       if (refNoEntradaPilha == null){
 //           return true;
 //       }
 //       return false;
        return refNoEntradaPilha == null ? true:false;
    }

    @Override
    public String toString() {
        String stringRetorno = "____________________________\n";
        stringRetorno += "                     Pilha\n";
        stringRetorno += "                                   \n";
        No noAuxiliar = refNoEntradaPilha;
        while (true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado"+ noAuxiliar.getDado() +"}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "____________________________\n";
        return stringRetorno;
    }
}
