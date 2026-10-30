package decorator;

/**
 * Decorador concreto: adiciona dublagem PT-BR (+R$3,00).
 */
public class MidiaComDublagem extends MidiaDecorator {
    public MidiaComDublagem(Midia midia) { super(midia); }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Dublagem PT-BR";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 3.0;
    }

    @Override
    public void reproduzir() {
        super.reproduzir();
        System.out.println("  [Dublagem PT-BR ativada]");
    }
}