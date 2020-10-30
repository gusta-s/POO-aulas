public class Calculadora {
    public static void main(String[] args) {
        double valor1 = 100.0d;
        //double valor2 = 50.0d;
        double valor2 = 0.0d;
        double resultado;
        char codigoOperacao = 'd';
        
        if(codigoOperacao == 'a'){ // ADICAO
            resultado = valor1 + valor2; // resultado recebe a soma dos dois valores 
            System.out.println(resultado); // 150; 100
        }else if (codigoOperacao == 's'){ //SUBTRACAO 
            resultado = valor1 - valor2; // resultado recebe a diferenca dos dois valores 
            System.out.println(resultado); //50; 100
        }else if(codigoOperacao == 'd'){ // DIVISAO 
            if(valor2 != 0.0d){ // o valor 2 deve ser diferente de 0 para a operacao ser realizada 
                resultado = valor1/valor2; // resultado recebe o quociente dos dois valores 
                System.out.println(resultado); //2
            }else{ 
                resultado = 0.0d;
                System.out.println("nao eh possivel dividir por 0"); // se o resultado recebe 0 a operacao eh invalida
            }
        }else if(codigoOperacao == 'm'){ // MULTIPLICACAO 
            resultado = valor1 * valor2; // resultado recebe o produto dos dois valores 
            System.out.println(resultado); // 5000; 0
        }else{
            resultado = 0.0d;
            System.out.println("codigo de operacao invalido"); // se algum outro codigo alem de 'a', 's', 'd', 'm' for inserido, nao eh possivel realizar uma operacao
        }
    }
}
