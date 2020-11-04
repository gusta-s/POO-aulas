/*
* @author Marcos_Costa
* Aula06. POO- Representando tipos complexos de classes
*/

public class Voo{
    //código voo.java

    //atributos 
    int passageiro;
    int poltrona;

    Voo() {     /*contrutor -> inicializando variaveis*/ 
        passageiro  = 0; //referencia a atributo
        poltrona  = 150;
    }

    void adicionarPassageiro(){
        if(passageiro < poltrona){
            passageiro += 1;
        }
    }
    
    //Básico de Métodos:
    /*
    * tipo-retorno nome(lista-parametros-tipados){ intruções }
    */

    void exibirSoma(float x, float y, int cont){
    //void exibirSoms(int... params){
        if(cont < 1){
            return;
        }   
        //int soma = params[0] + params[1];
        float soma = x + y;

        //for(int i = 0; i < params[2]; i++){
        for( int i = 0; i < cont; i++){
            System.out.println(soma);
        }
        return;
    }


    public static void main(String[] args){
        
        //Criando instancias de classes -> objetos
        Voo voo = new Voo(); 
        voo.adicionarPassageiro();

        Voo piParaSlz = new Voo();

        Voo slzParaBsb = new Voo();
        slzParaBsb.adicionarPassageiro();

        Voo voo1 = new Voo();
        Voo voo2 = new Voo();

        //Método exibirSoma():
        Voo m = new Voo();
        m.exibirSoma(7.5f, 1.4f, 3);//referencia a metodo

        //usando classes
        voo2.adicionarPassageiro();
        System.out.println(voo2.passageiro); //console: 1

        voo2 = voo1; //voo2 aponta para voo1
		System.out.println(voo2.passageiro); //console: 0

        voo1.adicionarPassageiro();
		voo1.adicionarPassageiro();

		System.out.println(voo2.passageiro); //console: 2
        
    
    }
}