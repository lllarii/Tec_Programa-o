package banco;

public class Cliente {
	//COMPOSIÇÃO: classe que é atributo de outra classe. é um atributo da minha classe conta, no local de titular
    public int idCliente;
    public String nome;
    public String cpf;
    public String email;
    //criando método construtuor. Depois dos atributos, é um método q tem o mesmo nome da classe
    public Cliente(int id, String nome, String cpf, String email){
        this.idCliente= id;
        this.nome=nome;
        this.cpf=cpf;
        this.email=email;
    }
    public String mostraDados(){
        return "\n Cliente numero: "+this.idCliente+
                "\n Nome: "+this.nome+
                "\n CPF: "+this.cpf+
                "\n E-mail: "+this.email;
    }
}
