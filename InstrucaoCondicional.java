public class InstrucaoCondicional {
    public static void main(String[] args) {
        int valor1 = 10;
        int valor2 = 5;

        //MODELO 1
        if(valor1 > valor2){
            System.out.println("valor 1 eh maior que valor 2");
        }else{
            System.out.println("valor 1 nao eh maior que valor 2");
        }

        //MODELO 2
        if(valor1 > valor2){
            System.out.println("valor 1 eh maior que valor 2");
        }else if(valor1 < valor2){ // else if eh utilizado quando se ha multiplas condicoes a serem comparadas, como forma de evitar o uso excessivo de "if"
            System.out.println("valor 2 eh maior que valor 1");    
        }else{
            System.out.println("valor 1 e valor 2 sao iguais");
        }
    }
}
