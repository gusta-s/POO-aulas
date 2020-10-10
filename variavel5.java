public class variavel5 {
   public static void main(String[] args) {
       //OPERADORES DE ATRIBUICAO COMPOSTA 

       /* Podem ser feitas operacoes entre as variaveis utilizando-se 
        * operadores, sendo estes:
        * + -> soma
        * - -> subtracao
        * * -> multiplicacao
        * / -> divisao
       */
      
       int valor;
       int valor2;
       int valor3;

       valor = 10; 
       valor += 10; // valor = valor + 10
       System.out.println(valor); // 20

       valor = 10; 
       valor -= 10; // valor = valor - 10
       System.out.println(valor); // 0

       valor = 10; 
       valor *= 10; // valor = valor * 10
       System.out.println(valor); // 100

       valor = 10; 
       valor /= 10; // valor = valor + 10
       System.out.println(valor); // 1

       valor = 10;
       valor2 = 5;
       valor3 = 3;
       valor3 *= valor / valor2; // valor3 * (valor/valor2) -> 3 * (10/5)
       System.out.println(valor3);
   } 
}
