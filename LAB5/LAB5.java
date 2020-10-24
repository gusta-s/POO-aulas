package LAB5;

public class LAB5{
    public static void main(String[] args) {
        
        // LAÇO FOR
        int valor = 150, valor2= 100;

        //laço com pelo menos 3 intruções (inicialização; testes; atualizações)
        //tratar essas instruções como um bloco, ex: pode ter multiplas inicializações

        /*exemplos: 
        1. for(int valor1 = 1, valor2 = 2; (valor1 < 10 && valor2 < 5); valor1++, ++valor2) {
        2. for(int valor1 = 1, valor2 = 2; valor1 < 10; valor1 = ++valor2){
        */

        for(int valor1 = 1; valor1 < 100; valor1 *= 2) {
            System.out.println(valor1);
            System.out.println(valor2);

        }
        //exemplo 2- Tabuada(FOR):
        for(int num1 = 5, num2 = 1, total; num2 <= 10; num2 +=1){
            total = num1 * num2;
            System.out.println(num1 + " X "+ num2 + " = "+ total);
        }

         //LAÇO DO-WHILE
        
        do{

            System.out.println(valor);
            valor *=2;
            System.out.println(valor);
            System.out.println(valor2);

         }while(valor<100); //comando executado pl mns uma vez
        //while(valor<300 && valor2>100); pode por mais de uma condiçaos

        //exemplo -Tabuada(Do-While):
        do{
            int numb = 4, numb2 = 1;
            int reusltado;
            reusltado = numb * numb2;
            System.out.println(numb + " X "+ numb2 + " = "+ reusltado);
            numb2 += 1;

        }while( numb2 <= 10);
        

    }
}