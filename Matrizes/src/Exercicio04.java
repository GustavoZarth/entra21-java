import java.text.DecimalFormat;

public class Exercicio04 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		
		int[][] matriz = {
				{ 2104, 3, 399900 },
				{ 1600, 3, 329900 },
				{ 2400, 3, 369000 },
				{ 1416, 2, 232000 },
				{ 3000, 4, 539900 },
				{ 1985, 4, 299900 },
				{ 1534, 3, 314900 },
				{ 1427, 3, 199000 },
				{ 1380, 3, 212000 },
				{ 1494, 3, 242500 },
				{ 1940, 4, 240000 },
				{ 2000, 3, 347000 },
				{ 1890, 3, 330000 },
				{ 4478, 5, 699900 },
				{ 1268, 3, 259900 }
		};		
		
		double somaPrecos = 0;
		double mediaPrecos = 0;
		int menorCasa = 0;
		int maiorCasa = 0;
		int precoMenorCasa = 0;
		int casaMaisCara = 0;
		int quartosMaisCara = 0;
		int diferencaMaisMenos = 0;
		int quantidadeCasasTrezentos = 0;
		int quantidadeQuartosTrezentos = 0;
		double mediaQuartosCasasTrezentos = 0;
		
		
		for (int i = 0; i < matriz.length; i++) {
			//Media de preço das casas
			somaPrecos += matriz[i][2];
			
			//Menor casa e Maior casa
			if (i == 0) {
				menorCasa = i;
			} else if (matriz[i][0] < matriz[menorCasa][0]) {
				menorCasa = i;
			}		
			
			if (i == 0) {
				maiorCasa = i;
			} else if (matriz[i][0] > matriz[maiorCasa][0]) {
				maiorCasa = i;
			}
			
			//Quartos da mais cara
			if (i == 0) {
				casaMaisCara = i;
			} else if (matriz[i][2] > matriz[casaMaisCara][2]) {
				casaMaisCara = i;
			}
			
			//Media de quartos entre as de 300k
			if (matriz[i][2] > 300000) {
				quantidadeCasasTrezentos++;
				quantidadeQuartosTrezentos += matriz[i][1];
			}
		}
		
		mediaPrecos = somaPrecos / matriz.length;
		precoMenorCasa = matriz[menorCasa][2];
		quartosMaisCara = matriz[casaMaisCara][1];
		maiorCasa = matriz[maiorCasa][0];
		menorCasa = matriz[menorCasa][0];
		diferencaMaisMenos = maiorCasa - menorCasa;
		mediaQuartosCasasTrezentos = quantidadeQuartosTrezentos / quantidadeCasasTrezentos;
			
		System.out.println(df.format(mediaPrecos));
		System.out.println(df.format(precoMenorCasa));
		System.out.println(quartosMaisCara);
		System.out.println(diferencaMaisMenos);
		System.out.println(mediaQuartosCasasTrezentos);

	}
}

