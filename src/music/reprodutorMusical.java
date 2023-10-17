package music;

public class reprodutorMusical implements ReproduzirMusica {
    public void reproduzir() {
        System.out.println("Reproduzindo música...");
    }

    public void pausar() {
        System.out.println("Pausando música...");
    }

    public void avancar() {
        System.out.println("Avançando para a próxima faixa...");
    }

    public void retroceder() {
        System.out.println("Retrocedendo para a faixa anterior...");
    }
}