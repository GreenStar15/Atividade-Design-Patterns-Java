package decorator;

/**
 * Componente concreto do Decorator.
 * E a midia "base", sem nenhum recurso extra.
 */
public class Filme implements Midia {
    private final String titulo;

    public Filme(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String getDescricao() {
        return "Filme: " + titulo;
    }

    @Override
    public double getPreco() {
        return 20.0;
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo filme " + titulo);
    }
}