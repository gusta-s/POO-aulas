public class OperadoresLogicos {
    public static void main(String[] args) {
        int a = 20, b = 15, c = 5;
        boolean pronto = false;

        if(a > b & b > c){ // OPERADOR "E" -> AS DUAS CONDICOES DEVEM SER VERDADEIRAS
            System.out.println("a eh maior que c"); // retorna " a eh menor que c"
        }    
        if(a > b | b > c){ // OPERADOR "OU" -> PELO MENOS UMA CONDICAO DEVE SER VERDADEIRA
            System.out.println("a eh maior que c"); // retorna " a eh menor que c"
        }     
        if(a > b ^ b > c){ // OPERADOR "OU EXCLUSIVO" -> UMA CONDICAO DEVE SER VERDADEIRA E A OUTRA FALSA 
            System.out.println("a eh maior que c");// nao retorna nada 
        }
           
        if(!pronto){ // OPERADOR "NAO" -> RETORNA TRUE SE FOR FALSE E VICE-VERSA 
            System.out.println("continue"); //retorna "continue"
        }           
    }    
}
