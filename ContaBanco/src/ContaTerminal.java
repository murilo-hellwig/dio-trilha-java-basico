import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main (String [] args) throws Exception {
        // TO_DO: Conhecer e importar a classe Scanner

        // Exibir as mensagens para o nosso usuário

        // Exibir a mensagem "conta criada"
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // não sei bem onde posicionar o "saldo" dentro do código, ou se era pro usuário inputar essa informação

        //saldo = 301.15;

        System.out.println("Digite o seu nome completo: ");
        String nomeCliente = scanner.next();
        System.out.println("Digite o número da sua agência: ");
        int agencia = scanner.nextInt();
        System.out.println("Digite o número da sua conta: ");
        // a conta não pode ser double, tem que ser numero-digito, ainda não sei como fazer isso
        //double conta = scanner.nextDouble();


        // até aqui funcionou o input dos dados
        // Abaixo vou imprimir tudo junto pra ver se inputou certo

        System.out.println("Olá, " + nomeCliente + ". O saldo da sua " + agencia+conta + " é ");


    }

}
