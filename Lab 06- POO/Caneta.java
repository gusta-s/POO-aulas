/*
* @author Marcos_Costa
* Aula06. POO- Representando tipos complexos de classes
*/

//Outra aplicação
public class Caneta {
    
    //atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    //métodos
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor); //this -> alto referencia
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("A caneta esta tampada? " + this.tampada);
        
    }

    void rabiscar(){
        if ( this.tampada == true){
            System.out.println("ERRO! Caneta tampada");
        }else{
            System.out.println("Escrevendo...");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "preta";
        c1.ponta = 0.5f;
        c1.tampada = false;
        //c1.status(); // referencia a c1, porque foi quem chamou o metodo status()
        c1.rabiscar();
        c1.status();
    }
}
