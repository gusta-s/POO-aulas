/*Lab03- variaveis, tipos de dados e operadores matemáticos
  @author : Marcos Costa Oliveira
  Engenharia da Computação - UEMA
*/

public class Tipos_Variaveis{
   public static void main(String[] args){
         
        /*
        *DECLARANDO E NOMEANDO VARIAVEIS
        */

        int valorFinal; // palavra composta
        int valor;      // palavra simples

        // apenas letras e numeros sao utilizados 

        /*
        *USANDO VARIAVEIS
        */ 

        System.out.println(valorFinal); //ERROR-> variavel sem valor atribuido

        valor = 50;       // atribuição de valores
        valorFinal = 120;
        System.out.println(String.format("%s , %s", valor ,valorFinal)); // 50, 120

        valor = valorFinal;
        System.out.println(String.format("%s , %s", valor ,valorFinal)); // 120, 120

        /*
        *TIPOS DE VARIAVEIS
        */

        //tipos inteiros:
        byte tipoByte = 127;
        short tipoShort = 32767; // inteiro de 16 bits com complemento de dois
        int tipoInt = 20151617;  // inteiro de 32 bits com complemento de dois
        long tipoLong = 9223372036854775807L; //"L" deve ser posto no final, para indicar tipo long

        //tipos ponto flutuantes:
        float tipoFloat = 2.6f; //"f" deve ser posto no final, para indicar tipo float
        double tipoDouble = 0.0000000001d; //"d" deve ser posto no final, para indicar tipo double

        //caractere e tipo booleano:
        char letra = 'm'; //tipo char armazena um unico caractere
                          // colocado entre aspas simples
        String palavra = "java"; //o tipo String armazena setenças

        boolean programarEhBom = true;
        // o tipo "boolen" admite dois valores: verdadeiro (true) ou falso (false)
    
        




    }
}