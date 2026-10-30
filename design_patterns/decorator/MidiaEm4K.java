package decorator;

/**
 * Decorador concreto: adiciona qualidade 4K (+R$5,00).
 */
public class MidiaEm4K extends MidiaDecorator {
    public MidiaEm4K(Midia midia) { super(midia); }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " [4K]";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 5.0;
    }

    @Override
    public void reproduzir() {
        super.reproduzir();
        System.out.println("  [Reproduzindo em 4K]");
    }
}