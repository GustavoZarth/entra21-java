import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
	
		String nomeAluno = "";
		
		while (!nomeAluno.equals("fim")) {
			System.out.print("Digite o nome do aluno: ");
			nomeAluno = input.next();
			
			if (nomeAluno.toLowerCase().equals("fim")) {
				break;
			}
			
			System.out.print("\nDigite a nota da primeira prova: ");
			double nota1 = input.nextDouble();
			System.out.print("\nDigite a nota da segunda prova: ");
			double nota2 = input.nextDouble();
			
			double media = (nota1 + nota2) / 2;
			
			System.out.println("\nMédia do aluno " + nomeAluno + ": " + df.format(media) + "\n");
		}
		
		input.close();
	}
}