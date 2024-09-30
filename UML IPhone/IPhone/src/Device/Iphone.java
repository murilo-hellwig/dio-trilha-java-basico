package Device;

import ferramentas.InternetDevice;
import ferramentas.Ipod;
import ferramentas.Telefone;

public class Iphone implements InternetDevice, Ipod, Telefone{
    
 
        public void ligar() {
            System.out.println("Ligando para "+contato+"!");
            }
        public void atender(){
            System.out.println(contato+" na linha!");
            }
        public void iniciarCorreioVoz(){
            System.out.println("Correio de voz do meu IPHONE aberto, na sequencia escolha a mensagem que deseja escutar.");
            }
        String contato = "fulano";
        public void tocar() {
            System.out.println("Tocando músicas do Ipod!");
        }
        
    }


