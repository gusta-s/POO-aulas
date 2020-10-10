public class variavel4 {
    public static void main(String[] args) {

        // PRE-INCREMENTO E POS-INCREMENTO

        int valor;
        
        // PRE-INCREMENTO
        valor = 10;
        System.out.println(++valor);// a variavel eh incrementada antes de ser printada: 11
        System.out.println(valor); // o valor permanece incrementado:11

        // POS INCREMENTO 
        valor = 10;
        System.out.println(valor++);// a variavel eh incremenatada apos ser printaDa, imprimindo um valor sem incremento:10
        System.out.println(valor);// a variavel eh impressam com o incremento:10

        //PRE-INCREMENTO
        valor = 10;
        System.out.println(--valor);// a variavel eh incrementada antes de ser printada:9
        System.out.println(valor); // o valor permanece incrementado:9

        // POS INCREMENTO 
        valor = 10;
        System.out.println(valor--);// a variavel eh incremenatada apos ser printada, imprimindo um valor sem incremento:10
        System.out.println(valor);// a variavel eh impressam com o incremento:9
    }
}
