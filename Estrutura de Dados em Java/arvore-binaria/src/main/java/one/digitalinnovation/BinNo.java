package one.digitalinnovation;

public class BinNo <T extends Comparable<T>>{
    private T conteúdo;
    private BinNo<T> noEsq;
    private BinNo<T> noDir;

    public BinNo(T conteúdo) {
        this.conteúdo = conteúdo;
        noEsq = noDir = null;
    }
    public BinNo(){
    }

    public T getConteúdo() {
        return conteúdo;
    }

    public void setConteúdo(T conteúdo) {
        this.conteúdo = conteúdo;
    }

    public BinNo<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(BinNo<T> noEsq) {
        this.noEsq = noEsq;
    }

    public BinNo<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(BinNo<T> noDir) {
        this.noDir = noDir;
    }

    @Override
    public String toString() {
        return "BinNo{" +
                "conteúdo=" + conteúdo +
                '}';
    }
}
