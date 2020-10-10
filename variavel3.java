public class variavel3 {
    public static void main(String[] args) {
        int valor1 = 10;       
        int valor2 = valor1;
        valor1 = 20;

        // PARA PRINTAR OS DOIS USANDO DOIS COMANDOS
        System.out.println(valor1); // 20
        System.out.println(valor2); // 10

        //PARA PRINTAR OS DOIS VALORES USANDO UM UNICO COMANDO
        System.out.println(String.format("%s , %s", valor1 ,valor2)); //20 10  
    }
}
