/*Lab03- variaveis, tipos de dados e operadores matemáticos
  @author : Marcos Costa Oliveira
  Engenharia da Computação - UEMA
*/

public class Tipos_Variaveis{
   public static void main(String[] args){
         
        /*
        * DECLARANDO E NOMEANDO VARIAVEIS
        */

        int ValorFinal; // palavra composta
        int valor;      // palavra simples

        // apenas letras e numeros sao utilizados 

        /*
        * USANDO VARIAVEIS
        */
        //System.out.println(ValorFinal); //ERROR-> variavel sem valor atribuido

        valor = 50;       // atribuição de valores
        ValorFinal = 120;
        System.out.println(String.format("%s , %s", valor ,ValorFinal)); // 50, 120

        valor = ValorFinal;
        System.out.println(String.format("%s , %s", valor ,ValorFinal)); // 120, 120




    }
}