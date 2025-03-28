import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o número de alunos na sala");
		int alunos = input.nextInt();
		int vinteMais = 0;
		
		for (int i = 0; i < alunos; i++) {
			System.out.println("Digite o nome do aluno:");
			String nome = input.next();
			System.out.println("Digite a idade do aluno:");
			int idadeAluno = input.nextInt();
			
			if (idadeAluno == 18) {
				System.out.println("O aluno(a) " + nome + " possui 18 anos.");
			} else if (idadeAluno > 20) {
				vinteMais++;
			}
		}
		
		System.out.println("Dentre os " + alunos + " alunos da sala, " + vinteMais + " possuem mais de 20 anos de idade");
		
		input.close();
	}
}

