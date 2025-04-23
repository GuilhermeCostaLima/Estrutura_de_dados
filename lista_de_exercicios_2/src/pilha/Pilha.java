package pilha;

//para funcionar com qualquer tipo
public class Pilha<T> {
    private T[] elementos;
    private int topo;

    @SuppressWarnings("unchecked")
    public Pilha(int capacidade) {
        //cria array
        elementos = (T[]) new Object[capacidade];
        topo = -1;
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public boolean empilhar(T elemento) {
        //verifica se está cheia
        if (topo == elementos.length - 1) return false;
        elementos[++topo] = elemento;
        return true;
    }

    public T desempilhar() {
        //remove o ultimo item
        if (estaVazia()) return null;
        return elementos[topo--];
    }

    public T topo() {
        if (estaVazia()) return null;
        return elementos[topo];
    }
}
