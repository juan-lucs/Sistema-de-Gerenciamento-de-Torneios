public interface Exibivel {

    void exibir();

    default void exibirResumo() {
        System.out.println("Resumo padrão...");
    }

    }

