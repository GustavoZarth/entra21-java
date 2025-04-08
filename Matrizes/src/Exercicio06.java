
public class Exercicio06 {
	public static void main(String[] args) {
		
		char matriz[][] = new char[4][4];
		
		System.out.println("Figura 1\n");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println("\nFigura 2\n");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if ((i == 1 && (j == 1 || j ==2)) || (i == 2 && (j == 1 || j == 2))) {
					System.out.print(' ');
				} else {
					System.out.print('*');
				}
			}
			System.out.println();
		}
		
		System.out.println("\nFigura 3\n");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	}
}
