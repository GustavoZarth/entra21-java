public class Exercicio02 {
	public static void main(String[] args) {

		//1 - Multiplique os valores da diagonal primária
		//2 - Divida os valores da diagonal secundária
		//3 - Valor da secundária menos o valor da primária
		
		int matriz[][] = {
				{ 4, 12 },
				{ 2, -3 }
		};
		
		double primaria = matriz[0][0] * matriz[1][1];
		double secundaria = -(matriz[1][0] * matriz[0][1]);
		double determinante = secundaria + primaria;
		
		System.out.println(determinante);
		
	}
}
