/*Lab04- variaveis, tipos de dados e operadores matemáticos
  @author : Marcos Costa Oliveira
  Engenharia da Computação - UEMA
  Data da aula: 10/10/2020
*/

public class Calculadora {

	public static void main(String[] args) {
		
		// definicao das variaveis
		double valor1, valor2;
		double resultado = 0.0d;
		char codigoOperacao; /*adicao 'a', subtacao 's', multiplicacao'm', divisao 'd' */
		
		// inicializacao das variaveis com os valores
		valor1 = 50.5d; valor2 = 25.25d;
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