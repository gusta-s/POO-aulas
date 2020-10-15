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
        System.out.println(numb); //console-> 30

        numb -= 5;
        System.out.println(numb); //console -> 25

        int resultado = 180;
        System.out.println(resultado); //console -> 180

        int numb1 = 6;
        resultado /= numb * numb1; //console 180/(6*15) = 2
        System.out.println(resultado); // console -> 2
        
















    }
}