public class Matrizes1 {
    public static void main(String[] args) {

        //float[] valores = new float[3]; // declaracao do vetor e seu tamanho
        //valores[0] = 10.0f; // a posicao 0 receb2 valor 10.0
        //valores[1] = 20.0f; // a posicao 1 recebe o valor 20.0
        //valores[2] = 30.0f; // a posicao 2 recebe o valor 30.0

        float[] valores = {10.0f, 20.0f, 30.0f}; // outra forma de declarar o vetor 

        int i; // variavel de controle 
        float soma = 0.0f; 
        for(i = 0; i < valores.length; i++);{
            soma += valores[i];    
        } 
        System.out.println(soma);
       
        //float [][] valores = new float[3][2]; // declaracao de matriz 

        //int i; // varaivel de controle ("linhas")
        //int j; // variavel de controle ("colunas")
        //for(i = 0; i < valores.length; i++){
            //for(j = 0; j < valores[0].length; j++);{
                //System.out.println(valores[i][j] + "\t");
            //}  
        //}

    }    
}
