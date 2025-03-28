import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma letra");
		char letra = input.next().charAt(0);
		letra = Character.toLowerCase(letra);
		
		if (Character.isLetter(letra)) {
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				System.out.println("O caractere é vogal");
			} else {
				System.out.println("O caractere é consoante");
			}
		} else {
			System.out.println("O caractere não é uma letra");
		}

		input.close();
	}
}
