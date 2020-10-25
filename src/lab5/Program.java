/**
 * @author Gustavo Soares
 * @version "11.0.8" 2020-07-14 LTS
 */

package lab5;

public class Program {

	public static void main(String[] args) {

		/*
		 * LAÇOS CONDICIONAL, LAÇOS E MATRIZES
		 */
		
		// WHILE
		System.out.print("While: ");
		int valor = 1;
		while (valor < 10) {
			System.out.print(valor + " ");
			valor *= 2;
		}
		
		System.out.print("\nDo..While: ");
		valor = 1;
		do {
			System.out.print("[" + valor + " * 2 = ");
			valor *= 2;
			System.out.print(valor + "] ");
		}while (valor < 100);

		//FOR
		System.out.print("\nFor: ");
		for (int valorFor = 1; valorFor < 10; valorFor *= 2) {
			System.out.print(valorFor + " ");
		}
		
		System.out.print("\nFor(condição composta): ");
		for (int valor1 = 1, valor2 = 2; (valor1 < 10 && valor2 < 5); valor1++, valor2++) {
			System.out.print("[valor1: " + valor1 + " valor2: " + valor2 + "] ");
		}
		
		System.out.print("\nFor(duas variáveis): ");
		for (int valor1 = 1, valor2 = 2; valor1 < 5; valor1 = valor2++) {
			System.out.print("[valor1: " + valor1 + " valor2: " + valor2 + "] ");
		}
		
		//FOR-EACH
		System.out.print("\nFor-Each: ");
		int[] numeros = {1, 2, 3, 4, 5};
		for (int numero : numeros) {
			System.out.print(numero + " ");
		}
		
		/*
		 * MATRIZES
		 */
		
		// 1 dimensao
		float soma = 0.0f;
		float[] valores = {10.0f, 20.0f, 30.0f};
		for (float valorForEach : valores) {
			soma += valorForEach;
		}
		System.out.println("\nSoma: " + soma); // 
		
		// matriz quadrada de "n" dimensoes
		int n = 10;
		System.out.println("Matriz " + n + "x" + n);
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print("+ ");
			}
			System.out.println();
		}
		
		// SWITCH
		System.out.print("Switch: ");
		valor = 10;
		switch(valor % 2) {
			case 0:
				System.out.println(valor + " é par!");
				break;
			case 1:
				System.out.println(valor + " é ímpar!");
				break;
		}
		
		// CONTINUE & BREAK
		System.out.print("Break: ");
		for (int i=0; i<5; i++) {
			if (i == 3) break;
			System.out.print(i + " ");
		}
		
		System.out.print("\nContinue: ");
		for (int i=0; i<5; i++) {
			if (i == 3) continue;
			System.out.print(i + " ");
		}
		
	}

}
