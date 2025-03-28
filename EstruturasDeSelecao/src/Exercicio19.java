import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de horas trabalhadas no mês:");
		int horasTrabalhadas = input.nextInt();
		
		System.out.println("Digite o valor recebido por hora:");
		double valorHora = input.nextDouble();
		
		int horaExtra = 0;
		
		if (horasTrabalhadas > 160) {
			horaExtra = horasTrabalhadas - 160;
		}
		
		double salarioFinal = valorHora * horasTrabalhadas + (horaExtra * (valorHora * 0.5));
		
		System.out.println("O salário do funcionário será de: " + salarioFinal);
		
		input.close();
	}
}
