import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Digite o nome do vendedor:");
		String nome = input.next();
		
		System.out.println("Digite o salário fixo do vendedor:");
		double salarioFixo = input.nextDouble();
		
		System.out.println("Digite o valor total em vendas:");
		double valorVendas = input.nextDouble();
		
		double porcentagemComissao = 0.15;
		double comissao = valorVendas * porcentagemComissao;
		double salarioFinal = salarioFixo + comissao;  
		
		System.out.println("NOME: " + nome);
		System.out.println("SALÁRIO FINAL: R$ " + df.format(salarioFinal));
		
		input.close();
	}
}
