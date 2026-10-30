package decorator;

/**
 * Demonstracao do padrao Decorator.
 * Mostra que a mesma midia base pode ser combinada com diferentes
 * decoradores, em runtime, sem criar classes novas por combinacao.
 */
public class MainDecorator {
    public static void main(String[] args) {
        // Cenario 1: filme sem nenhum extra
        Midia soFilme = new Filme("Interestelar");
        System.out.println("=== Cenario 1: midia pura ===");
        System.out.println(soFilme.getDescricao() + " | R$ " + soFilme.getPreco());
        soFilme.reproduzir();

        System.out.println();

        // Cenario 2: filme com legenda + 4K (2 decoradores empilhados)
        Midia filmeCompleto = new MidiaEm4K(new MidiaComLegenda(new Filme("Duna")));
        System.out.println("=== Cenario 2: legenda + 4K ===");
        System.out.println(filmeCompleto.getDescricao() + " | R$ " + filmeCompleto.getPreco());
        filmeCompleto.reproduzir();

        System.out.println();

        // Cenario 3: filme com legenda + dublagem + 4K (3 camadas)
        Midia premium = new MidiaEm4K(
                            new MidiaComDublagem(
                                new MidiaComLegenda(
                                    new Filme("Matrix"))));
        System.out.println("=== Cenario 3: legenda + dublagem + 4K ===");
        System.out.println(premium.getDescricao() + " | R$ " + premium.getPreco());
        premium.reproduzir();
    }
}