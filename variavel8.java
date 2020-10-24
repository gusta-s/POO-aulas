public class variavel8{
    public static void main(String[] args) {

        //CONVERSAO DE TIPO
        //int valorInt = 50;

        //long valorLong = valorInt; 
        /* uma variavel long pode receber um valor inteiro sem dar erro, ha memoria suficiente para isso*/

        //valorInt = valorLong; 
        /* uma variavel inteira nao pode receber valor um long, nao ha memoria. (casting implicito)*/

        //valorLong = 50;

        //valorInt = (int) valorLong; 
        /* para um valor inteiro receber um long devera ser usada essa sintaxe. (casting explicito) -> perde precisao*/

        float valorFloat = 1.0f;
        double valorDouble = 4.0d;
        byte valorByte = 7;
        short valorShort = 7;
        long valorLong = 5; 

        //short resultado1 = valorByte; // uma variavel short pode receber um valor byte (7)
        //short resultado1 = (short) valorByte; // utilizando esta sintaxe, o valor sera o mesmo (7)
         
        //short resultado1 = valorLong; // uma variavel short nao pode receber um valor long
        //short resultado1 = (short) valorLong; // para uma variavel short receber um valor long devera ser usada essa sintaxe (5)
        
        //short resultado2 = valorByte - valorLong; // o resultado dara um valor long, que a variavel tipo short nao aceita
        //short resultado2 = (short) (valorByte - valorLong); // devera ser usada esta sintaxe para a operacao

        //long resultado3 = valorLong - valorFloat; // o resultado dara um valor float, que a variavel tipo inteira nao aceita
        //float resultado3 = valorLong - valorFloat; // o resultado dara um valor float, que a variavel tipo float aceita (4.0)
        //float resultado3 = valorLong - valorDouble; // o resultado dara um valor double, que a variavel float nao aceita
        //double resultado3 = valorLong - valorDouble; // o resultado dara um valor double, que a variavel double aceita (1.0)

        //long resultado4 = valorShort - valorLong + valorFloat; //o resultado dara um valor float, que a variavel long nao aceita
        //long resultado4 = valorShort - valorLong + valorFloat + valorDouble; // o resultado dara um valor double, que a variavel long nao aceita
        //long resultado4 = (long) valorShort - valorLong + valorFloat + valorDouble; // o long transformora apenas o valor short, dando erro, pois o valor final sera um double 
        //long resultado4 = (long) (valorShort - valorLong + valorFloat + valorDouble); // deverea ser usada essa sintaxe (7)

    }
}