public class OperadoresLogicos2 {
    public static void main(String[] args) {
        int alunos = 150;
        int salas = 3;

        if(salas > 0 & alunos/salas > 30){ // VERIFICA AS DUAS CONDICOES MESMO SE A PRIMEIRA FOR FALSA
            System.out.println("lotada");     
        }
        if(salas > 0 && alunos/salas > 30){ // SO VERIFICA A SEGUNDA CONDICAO SE A PRIMEIRA FOR VERDADEIRA
            System.out.println("lotada");


        }    
        if(salas > 0 | alunos/salas > 30){ // VERIFICA AS DUAS CONDICOES MESMO SE A PRIMEIRA FOR FALSA
            System.out.println("lotada");    
        }
        if(salas > 0 || alunos/salas > 30){ // SO VERIFICA A SEGUNDA CONDICAO SE A PRIMEIRA FOR VERDADEIRA
            System.out.println("lotada");
        }    

    }
}
