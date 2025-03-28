import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("Insira o número do funcionário:");
		int numero = input.nextInt();
		
		System.out.println("Digite o nome do funcionário:");
		String nome = input.next();
		
		System.out.println("Digite a quantidade de horas trabalhadas:");
		int horas = input.nextInt();
		
		System.out.println("Digite o valor recebido por hora:");
		double valorHora = input.nextDouble();
		
		double salario = valorHora * horas;
		
		System.out.println("CÓDIGO: " + numero);
		System.out.println("NOME: " + nome);
		System.out.println("SALÁRIO: R$ " + df.format(salario));
		
		input.close();
	}
}
