import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double valoresIniciais[] = new double[10];
		double valoresFinais[] = new double[10];
		
		for (int i = 0; i < valoresIniciais.length; i++) {
			System.out.print("\nDigite um valor para o índice [" + i + "]:");
			valoresIniciais[i] = input.nextDouble();
			
			if (i % 2 == 0) {
				valoresFinais[i] = valoresIniciais[i] + (valoresIniciais[i] * 0.2);
			} else {
				valoresFinais[i] = valoresIniciais[i] + (valoresIniciais[i] * 0.5);
			}
		}
		
		System.out.print("\nValores Iniciais: ");
		for (int i = 0; i < valoresIniciais.length; i++) {
			System.out.print(valoresIniciais[i] + ", ");
		}

		System.out.println("\n");
		
		System.out.print("Valores Finais: ");
		for (int i = 0; i < valoresFinais.length; i++) {
			System.out.print(valoresFinais[i] + ", ");
		}
		
		input.close();
	}
}
