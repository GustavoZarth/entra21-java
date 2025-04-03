import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int normal[] = {2, 56, 23, 91, 82};
		int invertido[] = new int[normal.length];
		
		for (int i = 0; i < normal.length; i++) {
			invertido[i] = normal[normal.length - (1+i)];
		}
		
		for (int i = 0; i < invertido.length; i++) {
			System.out.print(invertido[i] + " ");
		}
		
		input.close();
	}
}
