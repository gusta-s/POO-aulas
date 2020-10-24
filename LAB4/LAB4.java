/** Lab 4
 * @author Victor Emanuel
 * Engenharia de Computação - UEMA
 * Programação Orientada a Objetos
 * Profº: Marcelo Vidigal
 */

package LAB4;

import java.util.Scanner;

public class LAB4 {

	public static void main(String[] args) {
		
		// definicao das variaveis
		double valor1, valor2;
		//String operacao; /* operação: adicao(1), subtracao(2), multiplicacao(3), divisao(4)*/
		int operacao;
		// inicializacao das variaveis com os valores
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insira o primeiro número: ");
		valor1 = in.nextInt(); 
		
		
		System.out.println("adicao(1), subtracao(2), multiplicacao(3), divisao(4)");
		System.out.print("Insira a operação: ");
		operacao = in.nextInt();
		
		
		System.out.print("Insira o segundo número: ");
		valor2 = in.nextInt();
		
		if(operacao == 1) {
			System.out.println( valor1 + valor2 );
		}else {
			if(operacao == 2) {
				System.out.println(valor1 - valor2);
			}else{
				if(operacao == 3) {
					System.out.println( valor1 * valor2 );
				}else{
					if (operacao == 4) {
						System.out.println(valor1 / valor2);
					}else{
						System.out.println("Operador inválido!");
					}
				}
			}
		}
	}
}
		
				