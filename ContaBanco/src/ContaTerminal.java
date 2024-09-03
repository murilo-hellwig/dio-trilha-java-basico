import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main (String [] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 301.15;

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.next();
        System.out.println("Digite o seu sobrenome: ");
        String sobrenomeCliente = scanner.next();
        System.out.println("Digite o número da sua agência: ");
        int agencia = scanner.nextInt();
        System.out.println("Digite o número da sua conta: ");
        String conta = scanner.next();

        System.out.println("Olá, "+nomeCliente+" "+sobrenomeCliente+". O saldo da sua conta "+agencia+"/"+conta+" é "+saldo);


    }

}
