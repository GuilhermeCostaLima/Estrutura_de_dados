package fila;

public class FilaImpressao {
    private Fila<Documento> fila = new Fila<>(10);

    public void adicionarDocumento(Documento doc) {
        if (fila.enfileirar(doc)) {
            System.out.println("Documento adicionado: " + doc);
        } else {
            System.out.println("Fila cheia! Não foi possível adicionar o documento.");
        }
    }

    public void imprimirProximo() {
        Documento doc = fila.desenfileirar();
        if (doc != null) {
            System.out.println("Imprimindo: " + doc);
        } else {
            System.out.println("Fila vazia Nenhum documento para imprimir");
        }
    }

    public void mostrarFila() {
        fila.mostrarFila();
    }
}
