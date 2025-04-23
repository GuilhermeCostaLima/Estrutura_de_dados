package pilha;

public class Editor{
    private String textoAtual = "";
    private Pilha<String> pilhaDesfazer = new Pilha<>(10);
    private Pilha<String> pilhaRefazer = new Pilha<>(10);

    public void inserirTexto(String novoTexto) {
        pilhaDesfazer.empilhar(textoAtual);
        pilhaRefazer = new Pilha<>(10);
        textoAtual += novoTexto;
    }

    public void desfazer() {
        if (!pilhaDesfazer.estaVazia()) {
            pilhaRefazer.empilhar(textoAtual);
            textoAtual = pilhaDesfazer.desempilhar();
        }
    }

    public void refazer() {
        if (!pilhaRefazer.estaVazia()) {
            pilhaDesfazer.empilhar(textoAtual);
            textoAtual = pilhaRefazer.desempilhar();
        }
    }

    public String getTextoAtual() {
        return textoAtual;
    }
}
