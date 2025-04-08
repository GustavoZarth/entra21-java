import java.text.DecimalFormat;

public class Exercicio05 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		
		int matriz[][] =  {
            	{1, 5, 52},
            	{2, 3, 41},
           		{2, 8, 65},
           		{1, 1, 28},
           		{2, 0, 19},
           		{1, 6, 33},
           		{1, 6, 63},
           		{1, 9, 27},
           		{2, 5, 59},
           		{2, 10, 13},
           		{2, 1, 46},
           		{1, 10, 70},
           		{1, 4, 12},
           		{2, 3, 54},
            	{1, 3, 67},
           		{2, 2, 51},
           		{1, 7, 34},
           		{1, 8, 55},
           		{1, 5, 42},
           		{2, 4, 66},
           		{2, 9, 30},
           		{1, 5, 60},
           		{2, 6, 15},
           		{1, 3, 31},
           		{1, 2, 49},
           		{2, 10, 38},
           		{1, 1, 20},
            	{2, 4, 43},
           		{1, 9, 56},
           		{1, 7, 21}
          	};
		
		double somaNotasGeral = 0;
		double somaNotasHomens = 0;
		int quantidadeHomens = 0;
		double mediaNotaGeral = 0;
		double mediaNotaHomens = 0;
		int mulherMaisJovemIndice = 0;
		int mulherMaisJovemNota = 0;
		int mulheresCinquenta = 0;
        
		for (int i = 0; i < matriz.length; i++) {
			somaNotasGeral += matriz[i][1];
			
			//Verifica se é feminino ou masculino
			if (matriz[i][0] == 1) {
				if (i == 0) {
					mulherMaisJovemIndice = i;
					mulherMaisJovemNota = matriz[i][1];
				} else if (matriz[mulherMaisJovemIndice][2] > matriz[i][2]) {
					mulherMaisJovemIndice = i;
					mulherMaisJovemNota = matriz[i][1];
				}
				
			}
			else {
				somaNotasHomens += matriz[i][1];
				quantidadeHomens++;
				}		
		}
		
		mediaNotaGeral = somaNotasGeral / matriz.length;
		mediaNotaHomens = somaNotasHomens / quantidadeHomens;
		
		for (int i = 0; i < matriz.length; i++) {
			
			if (matriz[i][0] == 1 && matriz[i][1] > mediaNotaGeral && matriz[i][2] > 50) {
				mulheresCinquenta++;
			}
		
		}
		
		System.out.println("Nota média do cinema: " + df.format(mediaNotaGeral));
		System.out.println("Nota média atribuída pelos homens: " + df.format(mediaNotaHomens));
		System.out.println("Nota da mulher mais jovem: " + df.format(mulherMaisJovemNota));
		System.out.println("Mulheres 50+ que deram nota acima da média geral: " + mulheresCinquenta);
	}
}