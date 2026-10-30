package decorator;

/**
 * Decorador concreto: adiciona legendas a midia (+R$2,00).
 * Reaproveita a delegacao do MidiaDecorator e so estende
 * o comportamento.
 */
public class MidiaComLegenda extends MidiaDecorator {
    public MidiaComLegenda(Midia midia) { super(midia); }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Legendas";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 2.0;
    }

    @Override
    public void reproduzir() {
        super.reproduzir();   // primeiro delega pra midia original...
        System.out.println("  [Legendas ativadas]");  // ...depois adiciona o extra
    }
}