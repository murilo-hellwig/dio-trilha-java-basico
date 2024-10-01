package User;

import Device.Iphone;

public class User {
    public static void main(String[] args) {
        Iphone celular = new Iphone();
        celular.ligar();
        celular.iniciarCorreioVoz();
        celular.selecionarMusica();
        celular.atualizarPagina();
        celular.exibirPagina();
    }
}
