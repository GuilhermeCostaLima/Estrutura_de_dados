import pilha.Editor;
import fila.Documento;
import fila.FilaImpressao;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Editor de Texto ===");
        Editor editor = new Editor();
        editor.inserirTexto("É os guri");
        editor.inserirTexto(", vai tomando");
        System.out.println("Texto atual: " + editor.getTextoAtual());

        editor.desfazer();
        System.out.println("Após desfazer: " + editor.getTextoAtual());

        editor.refazer();
        System.out.println("Após refazer: " + editor.getTextoAtual());

        editor.inserirTexto(" !");
        System.out.println("Novo texto: " + editor.getTextoAtual());

        editor.desfazer();
        editor.desfazer();
        System.out.println("Após desfazer duas vezes: " + editor.getTextoAtual());

        System.out.println("\n=== Fila de Impressão ===");
        FilaImpressao impressora = new FilaImpressao();
        impressora.adicionarDocumento(new Documento("Relatório", 120));
        impressora.adicionarDocumento(new Documento("Planilha", 45));
        impressora.adicionarDocumento(new Documento("PDF", 78));

        impressora.mostrarFila();
        impressora.imprimirProximo();
        impressora.imprimirProximo();
        impressora.mostrarFila();
    }
}
