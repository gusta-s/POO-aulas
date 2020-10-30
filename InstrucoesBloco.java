public class InstrucoesBloco {
    public static void main(String[] args) { 
        int valor1 = 10;
        int valor2 = 5;
        int diff;

        if (valor1 > valor2){
            diff = valor1 - valor2;
            System.out.println("valor 1 eh maior");
            System.out.print("diferenca: ");
            System.out.println(diff);
        }else if(valor2 > valor1){
            diff = valor2 - valor1;
            System.out.println("valor 2 eh maior");
            System.out.print("diferenca: ");
            System.out.println(diff);
        }else{
            System.out.println("os valores sao iguais");
        }
    }  
}
