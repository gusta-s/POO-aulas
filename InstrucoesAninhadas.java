public class InstrucoesAninhadas{
    public static void main(String[] args) {
        float alunos = 0.0f;
        float pontos = 6.0f;

        if (alunos > 0.0f){
            if(pontos > 0.0f){
                System.out.print("pontos por aluno: ");
                System.out.println(pontos/alunos);
            }else{
                System.out.println("a sala nao conseguiu nenhum ponto");  
            }      
        }else{
            System.out.println("sem alunos");
        } 

        System.out.println();
        System.out.println("fim do programa");
        
    }
}