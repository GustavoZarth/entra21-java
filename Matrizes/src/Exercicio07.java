
public class Exercicio07 {
	public static void main(String[] args) {

		int matriz[][] = {
				{ 32, 19, 4, 5, 33 },
				{ 64, 9, 11, 4, 27 },
				{ 91, 33, 0, 12, 15 }
		};
		
		int somaMatriz = 0;
		double mediaMatriz = 0;
		int pares = 0;
		int imparesMaiorMedia = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				somaMatriz += matriz[i][j];
				
				if (matriz[i][j] % 2 == 0) {
					pares++;
				}
				
				for (int k = 0; k < matriz.length; k++) {
					for (int l = 0; l < matriz[k]. length; l++) {
						if (matriz[i][j] == matriz[k][l]) {
							if (i != k && j != l) {
								System.out.println("O elemento " + matriz[i][j] + " foi repetido no índice [" + k + "][" + l + "]");
							}
						}
					}
				}
			}
		}
		
		mediaMatriz = somaMatriz / (matriz.length * matriz[0].length);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] % 2 != 0 && matriz[i][j] > mediaMatriz) {
					imparesMaiorMedia++;
				}
			}
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("Quantidade de números pares: " + pares);
		System.out.println("Ímpares maiores que a média: " + imparesMaiorMedia);
	}
}
