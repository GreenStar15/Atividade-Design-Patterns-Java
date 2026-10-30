package template_method;

/**
 * Subclasse concreta do Template Method.
 * Implementa as etapas especificas de SERIE e sobrescreve
 * o hook opcional (gerando playlist da temporada).
 */
public class ProcessadorSerie extends ProcessadorDeMidia {

    @Override
    protected void carregar() {
        System.out.println("  [2] Carregando episodios da serie (multiplos arquivos)...");
    }

    @Override
    protected void transformar() {
        System.out.println("  [3] Gerando thumbnails dos episodios...");
    }

    // Sobrescreve o hook opcional
    @Override
    protected void hookOpcional() {
        System.out.println("  [5] (hook) Gerando playlist da temporada...");
    }
}