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
			
		/*
		 * CASTING (IMPLICITO E EXPLICITO)
		 */
		
		int valorInt = 1;
		float valorFloat = 2.0f;
		double valorDouble = 3.0d;
		long valorLong = 4;
		byte valorByte = 5;
		short valorShort = 6;
		
		//valorInt = valorLong; // erro.  para fazer essa conversao, utiliza-se o casting [valorInt = (int)valorLong]
		valorInt = (int)valorLong;
		valorLong = valorInt; // ok
		
		//short resultadoCasting = valorInt; // erro
		short resultadoCasting = (short)valorByte;
		System.out.println(resultadoCasting); // 5
		
		double resultadoCasting2 = valorLong - valorDouble; // ok
		resultadoCasting = (short)(valorByte - valorLong); // ok
		System.out.println(resultadoCasting + " " + resultadoCasting2); // 1 1.0
		
		resultadoCasting2 = valorFloat - valorDouble;
		valorDouble = valorFloat;
		System.out.println(valorDouble); // 2.0
		
		// long resultadoCasting3 = valorShort - valorLong + valorInt - valorDouble; // erro
		long resultadoCasting3 = (long)(valorShort - valorLong + valorInt - valorDouble);
		System.out.println(resultadoCasting3); // 4
		
		/*
		 * LOGICA CONDICIONAL
		 */
		
		// operadores: [>][>=][<][<=][!=][==]
		
		if (valor1 >= valor4) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		boolean condicao1 = (valor4 > valor3); // o resultado de uma condicao é apenas true ou false
		System.out.println(condicao1); // true
		
		boolean condicao2 = (valor2 != 8);
		System.out.println(condicao2); // false
		
		boolean condicao3 = condicao1 == condicao2; // operacoes entre booleanos
		System.out.println(condicao3); // false
		
		// OPERADOR TERNARIO
		boolean condicao = (valor1 >= valor4) ? true : false; 
		System.out.println(condicao); // false
	}

}
