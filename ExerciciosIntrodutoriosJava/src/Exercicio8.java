import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		double valorA = input.nextDouble();
		
		System.out.println("Digite o valor de B:");
		double valorB = input.nextDouble();
		
		System.out.println("Digite o valor de C:");
		double valorC = input.nextDouble();
		
		double areaTriangulo = (valorA * valorC) / 2;
		double areaCirculo = (Math.PI * Math.pow(valorC, 2));
		double areaTrapezio = (valorA + valorB) / (2 * valorC);
		double areaQuadrado = valorB * valorB;
		double areaRetangulo = + (valorA * valorB);
		
		System.out.println("ÁREAS\n");
		System.out.println("TRIÂNGULO: " + areaTriangulo);
		System.out.println("CÍRCULO: " + areaCirculo);
		System.out.println("TRAPÉZIO: " + areaTrapezio);
		System.out.println("QUADRADO: " + areaQuadrado);
		System.out.println("RETÂNGULO: " + areaRetangulo);
		
		input.close();
	}
}
