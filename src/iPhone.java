import call.aparelhoTelefonicoImpl;
import music.reprodutorMusical;
import nav.NavegadorInternetImpl;

public class iPhone {

    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone();
        meuiPhone.ligarCelular();
        meuiPhone.usarReprodutorMusical();
        meuiPhone.navegarInternet();
        meuiPhone.fazerReceberChamada();
    }

    public void ligarCelular() {
        System.out.println("Ligando celular");
    }

    public void usarReprodutorMusical() {
        reprodutorMusical reprodutor = new reprodutorMusical();

        reprodutor.reproduzir();
        reprodutor.pausar();
        reprodutor.avancar();
        reprodutor.retroceder();
    }

    public void navegarInternet() {
        NavegadorInternetImpl navegador = new NavegadorInternetImpl();

        navegador.abrirURL("youtube");
        navegador.navegarHistórico();
        navegador.fecharNavegador();
    }

    public void fazerReceberChamada() {
        aparelhoTelefonicoImpl telefone = new aparelhoTelefonicoImpl();

        telefone.fazerChamada("5551123");
        telefone.encerrarChamada();
        telefone.receberChamada();
    }

}
