package aula1poo;

public class Aula1POO {

	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //classe executável
        //instanciando objeto: cria nome/variavel pro objeto com o mesmo tipo da classe
        Produto p= new Produto();
        Produto p2= new Produto();
        p.nome= "Chocolate";
        p.codigo= 01;
        p.preco= 12.00;
        String dados= p.mostrarDados();
        System.out.println(dados);
        System.out.println(p.mostrarDados());
        double total;
        total= p.calcularTotal(10);
        System.out.printf("\n %.2f", total);
    }

}
