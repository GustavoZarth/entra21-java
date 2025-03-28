import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o valor de A:");
		int a = input.nextInt();
		
		System.out.println("Digite o valor de B:");
		int b = input.nextInt();
		
		if (a > b) {
			System.out.println("A é maior que B");
		} else {
			System.out.println("B é maior que A");
		}
		
		input.close();
	}
}
