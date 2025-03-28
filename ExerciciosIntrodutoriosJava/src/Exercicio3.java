import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		int valorA = input.nextInt();
		
		System.out.println("Digite o valor de B:");
		int valorB = input.nextInt();
		
		System.out.println("Digite o valor de C:");
		int valorC = input.nextInt();
		
		System.out.println("Digite o valor de D:");
		int valorD = input.nextInt();
		
		int resultado = (valorA * valorB) - (valorC * valorD);
		
		System.out.println("RESULTADO: " + resultado);
		
		input.close();
	}
}
