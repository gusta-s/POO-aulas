public class Lacos1{
    public static void main(String[] args) {
        //LACO WHILE 
        int valor = 5;
        int fatorial = 1;

        while (valor > 1){ // PRIMEIRO A CONDICAO EH TESTADA, SE O ELA FOR VERDADEIRA, O COMANDO EH EXECUTADO
            fatorial *= valor; // FATORIAL RECEBE O VALOR 
            valor -= 1; // HA UM DECREMENTO NO VALOR, APOS ISSO, O CICLO EH REPETIDO E SO PARA QUANDO O VALOR CHEGAR A 1
        }
        System.out.println(fatorial); // 120

        while(valor > 1){
            fatorial *= valor--;
        }
        System.out.println(fatorial);

        //LACO DO-WHILE   
        //valor = 5; 
        valor = 150;

        do{ // PRIEMIRO O COMANDO EH EXECUTADO, DEPOIS O A CONDICAO EH TESTADA. MESMO QUE A CONDOCAO NAO SEJA VERDADEIRA, O COMANDO EH EXECUTADO PELO MENO UMA VEZ
            System.out.print(valor); 
            System.out.print(" x 2 = ");
            valor *= 2; 
            System.out.println(valor); 
        }while(valor < 100);

        //LACO FOR 
        //for (int valor = 1; valor < 100; valor *= 2){// A VARIAVEL JA FOI DECLARADA, PORTANTO O "INT" PROPORCIONA UM ERRO
            //System.out.println(valor);
        //}

        for (valor = 1; valor < 100; valor *= 2){ // O VALOR RECEBE 1 INICIALMENTE, E SEMPRE QUE FOR MENOR QUE 100, IRA SER MULTIPLICADO POR 2
            System.out.println(valor);
        }

        for (valor = 1; valor < 10; ++valor){  // O VALOR RECEBE 1 INICIALMENTE, E SEMPRE QUE FOR MENOR QUE 10, IRA SER INCREMENTADO 
            System.out.println(valor);
        }


    }
}