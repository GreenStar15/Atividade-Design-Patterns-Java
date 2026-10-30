package template_method;

/**
 * Subclasse concreta do Template Method.
 * Demonstra a forca do padrao: adicionar um novo tipo de midia
 * e so criar mais uma subclasse - o esqueleto em
 * ProcessadorDeMidia NAO precisa ser alterado.
 */
public class ProcessadorPodcast extends ProcessadorDeMidia {

    @Override
    protected void carregar() {
        System.out.println("  [2] Carregando audio do podcast (MP3)...");
    }

    @Override
    protected void transformar() {
        System.out.println("  [3] Transcrevendo audio em texto (speech-to-text)...");
    }

    @Override
    protected void hookOpcional() {
        System.out.println("  [5] (hook) Gerando capítulos por topico...");
    }
}