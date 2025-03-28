import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a idade de Marquinhos:");
		int marquinhos = input.nextInt();
		
		System.out.println("Digite a idade de Zezinho:");
		int zezinho = input.nextInt();
		
		System.out.println("Digite a idade de Luluzinha:");
		int luluzinha = input.nextInt();
		
		String pri;
		String seg;
		String ter;
		
		if (marquinhos > zezinho && marquinhos > luluzinha) {
			pri = "Marquinhos";
		} else if (zezinho > marquinhos && zezinho > luluzinha) {
			pri = "Zezinho";
		} else {
			pri = "Luluzinha";
		}
		
		if (marquinhos > zezinho && marquinhos < luluzinha || marquinhos < zezinho && marquinhos > luluzinha) {
			seg = "Marquinhos";
		} else if (zezinho > marquinhos && zezinho < luluzinha || zezinho < marquinhos && zezinho > luluzinha) {
			seg = "Zezinho";
		} else {
			seg = "Luluzinha";
		}
		
		if (marquinhos < zezinho && marquinhos < luluzinha) {
			ter = "Marquinhos";
		} else if (zezinho < marquinhos && zezinho < luluzinha) {
			ter = "Zezinho";
		} else {
			ter = "Luluzinha";
		}
		
		System.out.println("Mais velho = " + pri);
		System.out.println("Meio = " + seg);
		System.out.println("Mais novo = " + ter);
		
		input.close();
	}
}
