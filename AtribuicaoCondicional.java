public class AtribuicaoCondicional {
    public static void main(String[] args) {
        int valor1 = 10;
        int valor2 = 5;
        int valorMaior = valor1 > valor2 ? valor1 : valor2;
        /* ANTES DE "?" -> CONDICAO (valor1 > valor2)
        * "?" -> INDICA O FIM DA CONDICAO
        * DEPOIS DE "?" E ANTES DE ":" -> VALOR RETORNADO SE A CONDICAO FOR VERDADEIRA (valor1)
        * DEPOIS DE ":" -> VALOR RETORNADO SE A CONDICAO FOR FALSA (valor2)
        */
        System.out.println(valorMaior); // 10

        float alunos = 30;
        float salas = 5;
        float alunosPorSala = salas == 0.0f ? 0.0f : alunos/salas;

        System.out.println(alunosPorSala); // 6.0
    }    
}
