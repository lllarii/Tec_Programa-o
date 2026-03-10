package aula1poo;

public class Produto {
    //classe estática
    //atributos
    public String nome;
    public int codigo;
    public double preco;
    //métodos
    public String mostrarDados(){
        //variável local: espaço de memória q só existe enquanto função estiver operando
       String dados= "";
       dados="\n Nome: "+ this.nome + "\n Código: " + this.codigo + "\n R$ " + this.preco;
       // this traz informações disponíveis pra classe. nesse caso, chama o atributo dessa classe
       return dados;
    }
    public double calcularTotal(int quantidade){
        return quantidade*this.preco;
    }
}