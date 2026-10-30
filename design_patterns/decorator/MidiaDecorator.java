package decorator;

/**
 * DECORATOR ABSTRATO - a "casca" comum a todos os decoradores.
 * Por padrao, delega TUDO para a midia envolta.
 * Subclasses concretas sobrescrevem apenas o que querem mudar.
 */
public abstract class MidiaDecorator implements Midia {
    protected final Midia midia;   // composicao: "tem um" Midia dentro

    public MidiaDecorator(Midia midia) {
        this.midia = midia;
    }

    @Override
    public String getDescricao() { return midia.getDescricao(); }

    @Override
    public double getPreco() { return midia.getPreco(); }

    @Override
    public void reproduzir() { midia.reproduzir(); }
}