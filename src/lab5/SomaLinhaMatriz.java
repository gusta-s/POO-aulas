/**
 * @author Gustavo Soares
 * @version "11.0.8" 2020-07-14 LTS
 */

package lab5;

public class SomaLinhaMatriz {

	public static void main(String[] args) {

		// definicao da matriz
		float[][] matriz = {{10.0f, 2.0f, 45.0f}, {15.0f, 2.0f, 5.0f}, {16.0f, 20.0f, 15.5f}};
		
		// impressao da matriz e somas
		for (int i=0; i<matriz.length; i++) {
			float soma = 0.0f;
			for (int j=0; j<matriz[i].length; j++) {
				soma += matriz[i][j];
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println("Linha " + (i+1) + ": " + soma);
		}
		
		// soma de uma linha especifica
		int linha = 1;
		float soma = 0.0f;
		for (int j=0; j<matriz.length; j++) {
			soma += matriz[linha][j];
		}
		System.out.println("\nLinha " + linha + ": " + soma);

	}

}
