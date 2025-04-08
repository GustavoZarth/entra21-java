public class Exercicio03 {
	public static void main(String[] args) {
		
		int matrizA[][] = {
				{ 3, 5 },
				{-2, -4}
		};
		
		int matrizB[][] = {
				{ 7, -3 },
				{ 3, 8 }
		};		
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print((matrizA[i][j] + matrizB[i][j]) + " ");
			}
			System.out.println();
		}
		
	}
}
