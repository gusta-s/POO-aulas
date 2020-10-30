public class Lacos2 {
    public static void main(String[] args) {
        //LACO FOR-EACH
        float[] valores = {10.0f, 20.0f, 30.0f};
        float soma = 0.0f;
        
        for(float valorAtual : valores){ // A VARIAVEL valorAtual  IRA PERCORRER TODOS OS VALORES DO VETOR 
           soma += valorAtual;
           /* A VARIAVEL soma IRA RECEBER O VALOR INICIAL DO VETOR, DEPOIS IRA RECEBER O OUTOR VALOR E SOMA-LO AO ATUAL, 
           *A SOMA SE TORNARA O VALOR ATUAL E IRA RECEBR O PROXIMO VALOR, REPETINDO O CICLO 
           */ 
           System.out.println(soma);
        }
    }
}
