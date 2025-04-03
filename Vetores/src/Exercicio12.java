import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int vetor[] = new int[50];
		int opcao;
		int indice = 0;
		int valor = 0;
		int rodando = 1;

		while (rodando == 1) {
			System.out.println("MENU");
			System.out.println();
			System.out.println("1 - Incluir Valor");
			System.out.println("2 - Pesquisar Valor");
			System.out.println("3 - Alterar Valor");
			System.out.println("4 - Excluir Valor");
			System.out.println("5 - Mostrar Valores");
			System.out.println("0 - Sair do sistema");
			opcao = input.nextInt();

			switch (opcao) {
			case 1:
				if (indice != 50) {
					System.out.println("Digite um valor:");
					vetor[indice] = input.nextInt();
					indice++;
				} else {
					System.out.println("Você não pode adicionar mais valores!");
				}
				break;
			case 2:
				System.out.println("Digite um valor:");
				valor = input.nextInt();
				for (int i = 0; i < vetor.length; i++) {
					if (valor == vetor[i]) {
						System.out.println("O valor existe no vetor!");
						break;
					} else if (i == vetor.length - 1) {
						System.out.println("O valor não existe no vetor!");
					}
				}
				break;
			case 3:
				System.out.println("Digite um valor:");
				valor = input.nextInt();
				for (int i = 0; i < vetor.length; i++) {
					if (valor == vetor[i]) {
						System.out.println("Digite um novo valor:");
						vetor[i] = input.nextInt();
						break;
					} else if (i == vetor.length - 1) {
						System.out.println("Número não encontrado.");
					}
				}
				break;
			case 4:
				System.out.println("Digite um valor:");
				valor = input.nextInt();
				for (int i = 0; i < vetor.length - 1; i++) {
					if (valor == vetor[i]) {
						for (int j = i; j < vetor.length; j++)
							if (j != vetor.length - 1) {
								vetor[j] = vetor[j + 1];
							} else {
								break;
							}
					}
				}
				break;
			case 5:
				for (int i = 0; i < vetor.length; i++) {
					System.out.print(vetor[i] + ", ");
				}
				break;
			case 0:
				rodando = 0;
				break;
			default:
				System.out.println("Por favor, digite uma opção válida:");
				break;
			}
		}
		input.close();
	}
}
