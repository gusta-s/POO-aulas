/*Lab04- variaveis, tipos de dados e operadores matemáticos
  @author : Marcos Costa Oliveira
  Engenharia da Computação - UEMA
  Data da aula: 10/10/2020
*/

public class Operadores_Conversao{
    public static void main(String[] args) {

        /*
        * OPERADORES DE ATRIBUIÇÃO COMPOSTA
        *    sao eles: +=, -=, *=, /=, %=
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












    }
}