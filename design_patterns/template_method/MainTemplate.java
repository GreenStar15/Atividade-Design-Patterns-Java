package template_method;

/**
 * Demonstracao do padrao Template Method.
 * Cada chamada a processar() executa a MESMA sequencia de etapas,
 * mas o comportamento das etapas varia conforme a subclasse.
 */
public class MainTemplate {
    public static void main(String[] args) {
        System.out.println("=== Processando FILME ===");
        ProcessadorDeMidia filme = new ProcessadorFilme();
        filme.processar();

        System.out.println();
        System.out.println("=== Processando SERIE ===");
        ProcessadorDeMidia serie = new ProcessadorSerie();
        serie.processar();

        System.out.println();
        System.out.println("=== Processando PODCAST (novo tipo, sem alterar o esqueleto) ===");
        ProcessadorDeMidia podcast = new ProcessadorPodcast();
        podcast.processar();
    }
}