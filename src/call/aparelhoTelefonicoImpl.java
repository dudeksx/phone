package call;

public class aparelhoTelefonicoImpl implements aparelhoTelefonico {
    @Override
    public void fazerChamada(String número) {
        System.out.println("Fazendo chamada para: " + número);
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo chamada...");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Encerrando chamada...");
    }
}
