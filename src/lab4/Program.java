/**
 * @author Gustavo Soares
 * @version "11.0.8" 2020-07-14 LTS
 */

package lab4;

public class Program {

	public static void main(String[] args) {

		/*
		 * PRECEDENCIA DE OPERADORES
		*/
		int valor1 = 4, valor2 = 7, valor3 = 8, valor4 = 20, resultado;
		
		resultado = valor1 + valor3 / valor1;
		System.out.println(resultado); // 6
		
		resultado = (valor1 + valor3) / valor1;
		System.out.println(resultado); // 3
		
		resultado = (valor1 + valor3) / valor1 + (valor4 - valor2 * valor1 + valor4);
		System.out.println(resultado); // 15
		
		resultado = (valor4 * (valor1 + valor3)) / (valor1 + valor3);
		System.out.println(resultado); // 20
		
		resultado = valor1 + ++valor3 - valor1-- * ++valor2;
		System.out.println(resultado); // -19
			
	}

}
