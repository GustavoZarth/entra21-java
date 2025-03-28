import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escolha o que quer converter:");
		System.out.println("1 - Converter temperatura");
		System.out.println("2 - Converter peso");
		System.out.println("3 - Converter comprimento");
		System.out.println("4 - Converter volume");
		int escolha = input.nextInt();
		
		System.out.println("Digite o valor que quer converter");
		double valor = input.nextDouble();
		
		System.out.println("Escolha qual medida quer converter");
		
		if (escolha == 1) {
			System.out.println("1 - Celsius");
			System.out.println("2 - Fahrenheit");
			System.out.println("3 - Kelvin");
			
			escolha = input.nextInt();
			
			if (escolha == 1) {
				System.out.println("Celsius - Fahrenheit: " + (valor * 9/5 + 32));
				System.out.println("Celsius - Kelvin: " +  (valor + 273.15));
			} else if (escolha == 2) {
				System.out.println("Fahrenheit - Celsius: " + ((valor - 32) * 5 / 9));
				System.out.println("Fahrenheit - Kelvin: " + ((valor - 32) * 5 / 9 + 273.15)); 
			} else if (escolha == 3) {
				System.out.println("Kelvin - Celsius: " + (valor - 273.15));
				System.out.println("Kelvin - Fahrenheit: " + ((valor - 273.15) * 9/5 + 32));
			} else {
				System.out.println("Escolha inválida");
			}
			
		} else if (escolha == 2) {
			System.out.println("1 - Quilos");
			System.out.println("2 - Libras");
			System.out.println("3 - Onças");
			
			escolha = input.nextInt();
			
			if (escolha == 1) {
				System.out.println("Quilos - Libras: " + (valor * 2.205));
				System.out.println("Quilos - Onças: " +  (valor * 35.274));
			} else if (escolha == 2) {
				System.out.println("Libras - Quilos: " + (valor / 2.205));
				System.out.println("Libras - Onças: " + (valor * 16)); 
			} else if (escolha == 3) {
				System.out.println("Onças - Quilos: " + (valor / 35.274));
				System.out.println("Onças - Libras: " + (valor / 16));
			} else {
				System.out.println("Escolha inválida");
			}
			
		} else if (escolha == 3) {
			System.out.println("1 - Metros");
			System.out.println("2 - Pés");
			System.out.println("3 - Polegadas");
			
			escolha = input.nextInt();
			
			if (escolha == 1) {
				System.out.println("Metros - Pés: " + (valor * 3.281));
				System.out.println("Metros - Polegadas: " +  (valor * 39.37));
			} else if (escolha == 2) {
				System.out.println("Pés - Metros: " + (valor / 3.281));
				System.out.println("Pés - Polegadas: " + (valor * 12)); 
			} else if (escolha == 3) {
				System.out.println("Polegadas - Metros: " + (valor / 39.37));
				System.out.println("Polegadas - Pés: " + (valor / 12));
			} else {
				System.out.println("Escolha inválida");
			}
			
		} else if (escolha == 4) {
			System.out.println("1 - Litros");
			System.out.println("2 - Galões Líquidos");
			System.out.println("3 - Onças Líquidas");
			
			escolha = input.nextInt();
			
			if (escolha == 1) {
				System.out.println("Litros - Galões Líquidos: " + (valor / 3.785));
				System.out.println("Litros - Onças Líquidas: " +  (valor * 33.814));
			} else if (escolha == 2) {
				System.out.println("Galões Líquidos - Litros: " + (valor * 3.785));
				System.out.println("Galões Líquidos - Onças Líquidas: " + (valor * 128)); 
			} else if (escolha == 3) {
				System.out.println("Onças Líquidas - Litros: " + (valor / 33.814));
				System.out.println("Onças Líquidas - Galões Líquidos: " + (valor / 128));
			} else {
				System.out.println("Escolha inválida");
			}
			
		}
		
		input.close();
	}
	
}
