/**
 * @author Gustavo Soares
 * @version "11.0.8" 2020-07-14 LTS
 */

package lab5;

public class CalculadoraSwitch {

	public static void main(String[] args) {

		double[] numerosEsquerda = {10.0f, 20.0f, 30.0f, 40.0f};
		double[] numerosDireita = {23.3f, 2.45f, 213.5f, 89.76f};
		char[] operacoes = {'a', 's', 'd', 'm'};
		
		double[] resultados = new double[operacoes.length];
		
		for (int i=0; i<operacoes.length; i++) {
			switch(operacoes[i]) {
				case 'a':
					resultados[i] = numerosEsquerda[i] + numerosDireita[i];
					break;
				case 's':
					resultados[i] = numerosEsquerda[i] - numerosDireita[i];
					break;
				case 'd':
					resultados[i] = numerosDireita[i] != 0 ? numerosEsquerda[i]/numerosDireita[i] : 0.0d;
					break;
				case 'm':
					resultados[i] = numerosEsquerda[i] * numerosDireita[i];
					break;
				default:
					System.out.println("Erro!");
					resultados[i] = 0.0d;
					break;
			}
		}
		
		System.out.println("Resultados: ");
		for (double resultado : resultados) {
			System.out.println(resultado);
		}
		
		/*
		 * 33.3
		 * 17.5
		 * 0.14
		 * 3590.4
		 */

	}

}
