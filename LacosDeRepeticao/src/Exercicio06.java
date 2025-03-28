import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double alturaSoma = 0;
		int pessoas = 0;
		double novaAltura = 1;
		
		while (novaAltura != 0) {
			System.out.println("Digite uma altura");
			novaAltura = input.nextDouble();
			alturaSoma += novaAltura;
			if (novaAltura == 0) {
				break;
			} 
			pessoas++;
		}
		
		System.out.println("Média de altura = " + df.format((alturaSoma / pessoas)));
		
		input.close();
	}
}
