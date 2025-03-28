import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a idade do Homem 1");
		int idadeH1 = input.nextInt();
		
		System.out.println("Digite a idade do Homem 2");
		int idadeH2 = input.nextInt();
		
		System.out.println("Digite a idade da Mulher 1");
		int idadeM1 = input.nextInt();
		
		System.out.println("Digite a idade da Mulher 2");
		int idadeM2 = input.nextInt();
		
		int homemVelho;
		int homemNovo;
		int mulherVelha;
		int mulherNova;
		
		if (idadeH1 > idadeH2) {
			homemVelho = idadeH1;
			homemNovo = idadeH2;
		} else {
			homemVelho = idadeH2;
			homemNovo = idadeH1;
		}

		if (idadeM1 > idadeM2) {
			mulherVelha = idadeM1;
			mulherNova = idadeM2;
		} else {
			mulherVelha = idadeM2;
			mulherNova = idadeM1;
		}
		
		System.out.println(homemVelho + mulherNova);
		System.out.println(mulherVelha * homemNovo);
		
		input.close();
	}
}
