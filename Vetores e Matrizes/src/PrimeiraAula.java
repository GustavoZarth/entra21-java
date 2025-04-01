import java.util.Scanner;
public class PrimeiraAula {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int idades[] = new int [5];
		
		idades[0] = 18;
		idades[1] = 15;
		idades[2] = 27;
		idades[3] = 9;
		idades[4] = 17;
		
		//ou
		int idades2[] = {18, 15, 27, 9, 17};
		
		System.out.println(idades[0]);
		//até
		System.out.println(idades2[0]);
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println("A idade da pessoa " + (i+1) + " é " + idades[i]);
		}
		
		input.close();
	}

}
