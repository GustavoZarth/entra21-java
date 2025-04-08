import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int lucro[][] = {
				{ 1, 2000 },
				{ 2, 1500 },
				{ 3, 2100 },
				{ 4, 1850 },
				{ 5, 2000 },
				{ 6, 1900 },
				{ 7, 2250 },
				{ 8, 1800 },
				{ 9, 1750 },
				{ 10, 1650 },
				{ 11, 2100 },
				{ 12, 1950 }
		};

		for (int i = 0; i < lucro.length; i++) {
			for (int j = 0; j < lucro[i].length; j++) {
				System.out.print(lucro[i][j] + " ");
			}
			System.out.println();
		}
		
		input.close();
	}
}
