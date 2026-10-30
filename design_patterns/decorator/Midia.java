package decorator;

/**
 * Interface comum do padrao Decorator.
 * Tanto o componente concreto (Filme) quanto os decoradores
 * (MidiaComLegenda, MidiaComDublagem, MidiaEm4K) implementam esta interface.
 * E isso que garante que o objeto decorado CONTINUA sendo uma Midia.
 */
public interface Midia {
    String getDescricao();
    double getPreco();
    void reproduzir();
}