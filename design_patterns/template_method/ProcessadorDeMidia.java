package template_method;

/**
 * Classe abstrata do padrao Template Method.
 * Define o ESQUELETO do algoritmo de processamento (metodo processar())
 * e deixa etapas especificas para as subclasses.
 *
 * A palavra-chave "final" em processar() impede que subclasses
 * alterem a ORDEM das etapas - essa e a essencia do padrao.
 */
public abstract class ProcessadorDeMidia {

    // TEMPLATE METHOD: define a ordem fixa das etapas
    public final void processar() {
        validar();            // etapa fixa (implementada aqui)
        carregar();           // etapa variavel (subclasse implementa)
        transformar();        // etapa variavel (subclasse implementa)
        salvar();             // etapa fixa (implementada aqui)
        hookOpcional();       // hook: subclasse PODE sobrescrever
    }

    // --- etapas fixas ---

    protected void validar() {
        System.out.println("  [1] Validando midia...");
    }

    protected void salvar() {
        System.out.println("  [4] Salvando no catalogo...");
    }

    // --- etapas variaveis (abstratas, subclasse e obrigada a implementar) ---

    protected abstract void carregar();
    protected abstract void transformar();

    // --- hook (subclasse pode sobrescrever se quiser, nao e obrigada) ---

    protected void hookOpcional() { }
}