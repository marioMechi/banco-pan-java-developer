package one.digitalinnovation;

public class NoDuplo<T> {

    private T conteudo;
    private NoDuplo<T> noproximo;
    private NoDuplo<T> noprevio;

    public NoDuplo(T conteudo){
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getNoproximo() {
        return noproximo;
    }

    public void setNoproximo(NoDuplo<T> noproximo) {
        this.noproximo = noproximo;
    }

    public NoDuplo<T> getNoprevio() {
        return noprevio;
    }

    public void setNoprevio(NoDuplo<T> noprevio) {
        this.noprevio = noprevio;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
