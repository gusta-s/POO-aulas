/**
 * @author Gustavo Soares
 * @version "11.0.8" 2020-07-14 LTS
 */

package lab4;

public class Calculadora {

	public static void main(String[] args) {
		
		// definicao das variaveis
		double valor1, valor2;
		Double resultado = 0.0d;
		char operacao; /*adicao[a], subtacao[s], multiplicacao[m], divisao[d]*/
		
		// inicializacao das variaveis com os valores
		valor1 = 2.5d; valor2 = 0.0d;
		operacao = 'd';
	
		if (operacao == 'a') {
			resultado = valor1 + valor2;
		}
		else if (operacao == 's') {
			resultado = valor1 - valor2;
		}
		else if (operacao == 'm') {
			resultado = valor1 * valor2;
		}
		else if (operacao == 'd') {
			resultado = valor2 != 0.0d ? valor1/valor2 : null; // se for uma divisao por zero, o valor do resultado sera nulo
		}
		else {
			System.out.println("Operador inválido!");
		}
		
		if (resultado == null) {
			System.out.println("Erro! Divisão inválida");
		}
		else {
			System.out.println(resultado);
		}
	}
}
