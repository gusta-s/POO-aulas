
/*
* @author Marcos_Costa
* Aula06. POO- Representando tipos complexos de classes
*/

public class Calculadora {
    
    //atributos
    public double valorEsquerda;
    public double valorDireita;
    public char codigoOperacao;
    public double resultado;

    public void calcular() {
        swicth (codigoOperacao) {
            case 'a':
                resultado = valorEsquerda + valorDireita;
                System.out.println(resultado);
                break;
            case 's':
                resultado = valorEsquerda - valorDireita;
                System.out.println(resultado);
                break;
            case 'm':
                resultado = valorEsquerda * valorDireita;
                System.out.println(resultado);
                break;
            case 'd':
                resultado = valorDireita != 0.0d ? valorEsquerda / valorDireita : 0.0d;;
                System.out.println(resultado);
                break;
            default:
                System.out.println("erro: codigo operacao invalido");
                resultado = 0.0d;
                break;
        }
    }

    public static void main(String[] args) {
        Calculadora c1 = new Calculadora;
        c1.valorDireita = 0.1d;
        c1.valorEsquerda = 5.2d;
        c1.calcular('a');
    }
}
