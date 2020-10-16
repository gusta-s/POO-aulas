/*Lab04- variaveis, tipos de dados e operadores matemáticos
  @author : Marcos Costa Oliveira
  Engenharia da Computação - UEMA
  Data da aula: 10/10/2020
*/

public class Operadores_Conversao{
    public static void main(String[] args) {

        /*
        * OPERADORES DE ATRIBUIÇÃO COMPOSTA
        *    sao eles: [+=], [-=], [*=], [/=], [%=]
        */
        
        int numb = 15;
        numb *= 2;
        System.out.println(numb); //console = 30

        numb -= 5;
        System.out.println(numb); //console = 25

        int resultado = 180;
        System.out.println(resultado); //console = 180

        int numb1 = 6;
        resultado /= numb * numb1; //console 180/(6*15) = 2
        System.out.println(resultado); // console = 2
        
        /*
        * PRECEDENCIA DE OPERADORES
        *    pós-fixados> pré-fixados> multiplicativos> aditivos
        *    precedencia pode ser substituida por parenteses
        */

        int valor1 = 21;
        int valor2 = 6;
        int valor3 = 3;
        int valor4 = 1;

        int resultadoA = valor1 - valor2 / valor3; //ordem de precedencia
        System.out.println(resultadoA); //console = 19

        int resultadoB = valor1 * valor2 / valor3; //igual precedencia: esquerda -> direita
        System.out.println(resultadoB); //console = 42

        int resultadoC = (valor1 - valor2) / valor3; //precedencia pode ser substituida por parenteses
        System.out.println(resultadoC); //console = 5

        int resultadoD = valor1 / valor3 * valor4 + valor2; // (21/(3*1)) + 6
        System.out.println(resultadoD); //console = 13

        int resultadoE = valor1 / (valor3 * (valor4 + valor2)); // 21/ (3*(1+6))
        System.out.println(resultadoE); //console = 1

        int resultadoF = valor4 + --valor3 * valor2++; // 1+(2 * 6)
        System.out.println(resultadoF);//13

        /*
        * CONVERSAO DE TIPOS
        */

        //conversao implicita
        int valorInt = 50; 
        long valorLong = valorInt; //conversao executada automaticamente

        //conversao explicita
        //long valorLong = 50; 
        //int valorInt = (int) valorLong; //coversao explicitada em code
        
        long valorLong = 5;
        byte valorByte = 7;
        short resultado1 = valorByte;

        short resultado1 = valorLong;

        /*
        * LOGICA CONDICIONAL
        *  Operadores Relacionais
        */
        //sao eles: [>], [<], [>=], [<=], [==], [!=]

        if (valor1 > valor2){
          System.out.println("valor1 eh mair");

        }else if (valor1 < valor2){
          System.out.println("valor2 eh maior ");

        }else {
          System.out.println("os valores sao iguais");

        }

        boolean condition1 = (valor1 > valor2); //reusltado apenas 'true' ou 'false'
        System.out.println(condition1); //true

        boolean condition2 = (valor1 < valor2);
        System.out.println(condition2); //false

        /* Operadores Logicos 
        *  sao eles: [&], [|], [^], [!]
        */
        
        int a = 15, b = 7 , c = 5;
        boolean resultLogic = true;

        if (a < b & b > c){  //( false AND true) e
          System.out.println( !resultLogic ); //false

        }else if(a => b | b > c){  //(true OR true) ou
          System.out.println(resultLogic); //true

        }else if( a < c ^ b <= a){ //(false XOR true) ou exclusivo
          System.out.println(resultLogic);
        }

    }
}