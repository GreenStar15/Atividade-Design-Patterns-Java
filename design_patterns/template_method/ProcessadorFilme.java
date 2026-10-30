package template_method;

/**
 * Subclasse concreta do Template Method.
 * Implementa apenas as etapas que variam para FILME.
 */
public class ProcessadorFilme extends ProcessadorDeMidia {

    @Override
    protected void carregar() {
        System.out.println("  [2] Carregando filme (arquivo MP4)...");
    }

    @Override
    protected void transformar() {
        System.out.println("  [3] Aplicando compressao H.265 para filmes...");
    }
}