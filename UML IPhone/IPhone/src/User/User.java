package User;

import Device.Iphone;

public class User {
    public static void main(String[] args) {
        Iphone celular = new Iphone();
        celular.ligar();
        celular.tocar();
        celular.iniciarCorreioVoz();
    }
}
