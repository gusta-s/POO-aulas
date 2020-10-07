/**
 * @author Gustavo Soares
 * @version "11.0.8" 2020-07-14 LTS
 */

package lab3;

public class Variaveis2 {
	public static void main(String[] args) {
		int variavel;
		//System.out.println(variavel); // erro
		
		variavel = 50;
		System.out.println(variavel); // console: 50
		
		int outraVariavel = 100;
		System.out.println(outraVariavel); // console: 100
		
		variavel = outraVariavel;
		System.out.println(variavel); // console: 100
		
		outraVariavel = 200;
		System.out.println(outraVariavel); // console: 200
		
		Integer variavel2; // tipos primitivo de variavel
		variavel2 = null;
		System.out.println(variavel2); // console: null
		
		/*
		 * TIPOS DE VARIÁVEIS
		 */
		byte letras = 26;
		Byte letras2 = 26; // tambem eh um tipo primitivo (tipos primitivos admitem o valor null)
		System.out.println(letras + " " + letras2);
		//letras = null; // erro
		letras2 = null;
		
		short anoAtual = 2020;
		long numeroLong = 216545154154154L; // o "L" deve ser posto no final do numero para indicar que eh do tipo long
		float nota = 8.5f; // "f" deve ser posto no final para indicar que eh float
		double numeroDouble = 0.00255050500450d; // "d" deve ser posto no final para indicar que eh double
		
		/* esses tipos tambem admitem tem sua versao primitiva*/
		Short primitivoShort = anoAtual;
		Long primitivoLong = numeroLong;
		Float primitivoFloat = nota;
		Double primitivoDouble = numeroDouble;
		
		System.out.println(primitivoShort + " " + anoAtual);
		
		boolean javaMelhorLinguagem = true; // o tipo "boolen" admite dois valores: verdadeiro (true) ou falso (false)
		char letra = 'g';
		//char nome = 'Gustavo'; // erro: o tipo char armazena apenas 1 letra
		String nome = "Gustavo"; // o tipo String armazena sentenças (palavras/frases)
								 // vale salientar que as aspas, para a String, são duplas
		
		System.out.println(letra + nome); // concatenacao
		System.out.println(letra + " " + nome);
		
		/*
		 * INCREMENTO
		 */
		int variavel3 = 5;
		System.out.println(++variavel3 + " -> pre-incremento"); // ela eh incrementada antes de imprimir
		System.out.println(variavel3 + " -> variavel");
		
		variavel3 = 5;
		System.out.println(variavel3++ + " -> pos-incremento"); // ela eh incrementada depois de imprimir
		System.out.println(variavel3 + " -> variavel");
		
		// o mesmo acontece para o sinal negativo (pre e pos decremento):
		
		variavel3 = 5;
		System.out.println(--variavel3 + " -> pre-decremento"); // ela eh decrementada antes de imprimir
		System.out.println(variavel3 + " -> variavel");
		
		variavel3 = 5;
		System.out.println(variavel3-- + " -> pos-decremento"); // ela eh decrementada depois de imprimir
		System.out.println(variavel3 + " -> variavel");
		
	}

}
