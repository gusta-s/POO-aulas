/** Lab 3
 * @author Victor Emanuel
 * Engenharia de Computação - UEMA
 * Programação Orientada a Objetos
 * Profº: Marcelo Vidigal
 */

public class TiposVariaveis{
	public static void main(String[] args){
		  
		 //DECLARANDO VARIAVEIS
 
		 int variavel; // variavel simples
		 int numVariavel; // variavel composta
 
		 // apenas letras e numeros sao utilizados 
 
		 //USANDO VARIAVEIS 
 
		 variavel = 10;       // atribuindo de valores
		 numVariavel = 100;
		 System.out.println(String.format("%s , %s", variavel ,numVariavel)); // iah printar: 10, 100
 
		 variavel = numVariavel;
		 System.out.println(String.format("%s , %s", variavel ,numVariavel)); // variaveis serao iguais: 100, 100
 
		 //TIPOS DE VARIAVEIS
 
		 //Inteiros:
		 byte v1 = 10; // inteiro de 8 bits 
		 short v2 = 100; // inteiro de 16 bits
		 int v3 =1000;  // inteiro de 32 bits
		 long v4 = 1000000000000L; //"L" deve ser colocado no final para indicar tipo long
 
		 //Ponto flutuantes:
		 float tipoFloat = 3.5f; //"f" deve ser colocado no final para indicar tipo float
		 double tipoDouble = 10.0000000003d; //"d" deve ser posto no final para indicar tipo double
 
		 //Caractere e booleano:
		 char letra = 'a'; //char armazena uma única letra/caractere

		 String palavra = "mundo"; //string armazena uma palavra
 
		 boolean bebiagua = true;// boolean é do tipo lógica, valores: verdadeiro (true) ou falso (false)
	   
 
		 /**INCREMENTO E DECREMENTO
		 // operadores pré-determinados
		 */

		 int num = 1;
		 System.out.println(++num); //somou-se num a 1: 2
		 System.out.println(num);   
 
		 num = 3;
		 System.out.println(num);   //printou o valor de num: 3
		 System.out.println(++num); //somou-se num a 1: 4
	   
		 num = 5;
		 System.out.println(--num); //subtraiu-se 1 de num: 4
		 System.out.println(num);   //printou o novo valor de num: 4
 
		 num = 10;
		 System.out.println(num);   //printou o valor de num: 10
		 System.out.println(--num); //subtraiu-se 1 de num: 9
 
	}
 }