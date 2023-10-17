package nav;

public class NavegadorInternetImpl implements navegadorInternet {
    @Override
    public void abrirURL(String url) {
        System.out.println("Abrindo URL: " + url);
    }

    @Override
    public void fecharNavegador() {
        System.out.println("Fechando navegador...");
    }

    @Override
    public void navegarHistórico() {
        System.out.println("Navegando no histórico...");
    }
}
