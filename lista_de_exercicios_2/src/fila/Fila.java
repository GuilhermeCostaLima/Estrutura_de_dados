package fila;

public class Fila<T> {
    private T[] elementos;
    private int inicio, fim, tamanho;

    @SuppressWarnings("unchecked")
    public Fila(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public boolean enfileirar(T elemento) {
        if (tamanho == elementos.length) return false;
        elementos[fim] = elemento;
        //para circular o array
        fim = (fim + 1) % elementos.length;
        tamanho++;
        return true;
    }

    public T desenfileirar() {
        if (estaVazia()) return null;
        T elemento = elementos[inicio];
        inicio = (inicio + 1) % elementos.length;
        tamanho--;
        return elemento;
    }

    public int tamanho() {
        return tamanho;
    }

    public void mostrarFila() {
        System.out.print("Fila: ");
        for (int i = 0; i < tamanho; i++) {
            int idx = (inicio + i) % elementos.length;
            System.out.print(elementos[idx] + " ");
        }
        System.out.println();
    }
}
