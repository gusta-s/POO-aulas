public class Switch {
    public static void main(String[] args) {
        //int valor = 10;
        //int valor = 25;
        int valor = 30;
        
        switch(valor%2){ // EXECUTA O COMANDO (MODULO DA DIVISAO POR) E COMPARA EM QUAL CASO O RESULTADO SE ENCAIXA
            case 0: // CASO O RESULTADO DO COMANDO SEJA 0, O NUMERO SERA PAR, EXECUTANDO ESTE CASO
                System.out.print(valor);
                System.out.println("eh par");
                break;
            case 1: //CASO O RESULTADO DO COMANDO SEJA 0, O NUMERO SERA IMPAR, EXECUTANDO ESTE CASO
                System.out.print(valor);
                System.out.println("eh impar");
                break;
            default: // CASO HAJA QUALQUER OUTRO RESULTADO, SERA EXECUTADO ESTE CASO 
                System.out.print("esta quebrado");
                break;
        }
    }
}
