public class variavel7{
    public static void main(String[] args) {
        int valor1 = 21;
        int valor2 = 6;
        int valor3 = 3; 
        int valor4 = 1;

        int resultado1 = valor1 - valor2 / valor3; 
        // Sera feita primeiro a divisao, de acordo com a regras matematicas
        
        int resultado2 = (valor1 - valor2) / valor3; 
        //Sera feito primeiro o que esta entre parenteses, de acordo com as regras matematicas

        System.out.println(resultado1); // 19
        System.out.println(resultado2); // 5

        int resultado3 = valor1 / valor3 * valor4 + valor2; 
        //sera feita primeiro a divisao, depois a multiplicacao,e por ultimo, a soma, de acordo com as regras matematicas 
        
        int resultado4 = valor1 / (valor3 * (valor4 + valor2));
        // sera feito primeiro o que esta entre parenteses, partindo do mais interno para o mais externo, de acordo com as regras matematicas

        System.out.println(resultado3); // 13
        System.out.println(resultado4); //1

        int resultado5 = valor4 + --valor3 * valor2++;
        // sera feito primeiro os incrmentos. No pos-icremento, o valor eh printado antes de ser incrementado, entao
        /* valor2++ continuara 6, ja no pre-incremento, primeiro o valor eh incrementado e depois eh printado entao
        /* --valor3 sera 2. Depois sao feitas as operacoes de acordo com as regras matematicas: primeiro multiplicacao
        e divisao, depois soma e subtracao
        */
        
        System.out.println(resultado5); // 13
    }
}