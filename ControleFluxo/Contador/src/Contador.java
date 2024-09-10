import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
public ParametrosInvalidosException(String mensagem) {
super(mensagem);
}
}



public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		terminal.close();
    
		try {
			//chamando o método contendo a lógica de contagem
			if (parametroUm > parametroDois) {
				throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
			}
			contar(parametroUm, parametroDois);
		
		} catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(exception.getMessage());
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        for(int x = 0; x <= contagem; x++) {
            System.out.println("Imprimindo o número "+x);
        }
	}
}