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
	}

}
