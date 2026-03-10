package banco;
import java.util.Scanner;
import banco.Conta;

public class Teste {

	public static void main(String[] args) {
		//classe criada em botao direito no banco-> others-> Main Class pra criar classe executável alternativa, útil em testes
        //shift+f6 executa essa classe de testes em vez da principal (banco)
        // TODO code application logic here
         //método construtor. Cria espaço em memória vazio, sem as informações que atribuirei depois
        Scanner scanner = new Scanner(System.in);
        Cliente cli1=new Cliente(2, "Nero Imperador", "1234", "imperador@nero.com"); //método construtor que já recebe as informações
        Conta c1= new Conta(1, cli1, 0);
        System.out.println(c1.mostraDados());
        Conta c2= new Conta(3, new Cliente(3, "Nero Imperador", "1234", "imperador@nero.com"), 20000);
        System.out.println(c2.mostraDados());
        /* pra casa criar menu de opções usando JOptions
        1- abrir conta, incluindo ciar cliente
        2- sacar
        3- depositar
        4- mostrar dados
        5- transferir(a criada e uma destino)
        0-sair
        */
 
        /*
        Conta c= new Conta();
        Cliente cli=new Cliente();
        cli.nome= "Ronaldinho Gaucho";
        cli.idCliente=1;
        cli.cpf="123";
        cli.email="ronaldinho@gaucho.com";
        c.titular=cli;
        c.numero=123;
        c.saldo=500;
        System.out.println(c.mostraDados());
        */
        Funcionario joao= new Funcionario();
        joao.salario=1500;
        System.out.println("Salário atual: R$ "+ joao.salario);
        double aumento= scanner.nextDouble();
        joao.recebeAumento(aumento);
        System.out.println("Salário com aumento: R$"+ joao.salario);
        System.out.println("Ganho anual: R$ "+joao.calculaGanhoAnual());



        /* Conta c2;
        c.numero=1; c1.numero=1;
        c.titular= "Pedro"; c1.titular="Pedro";
        c.saldo=500; c1.saldo=500;
        System.out.println(c==c1);
        c2=c;
        System.out.println(c==c2);
        System.out.println("Conta c: "+c);
        System.out.println("Conta c: "+c1);
        System.out.println("Conta c: "+c2);
        //em vez de mostrar o espaço de memória, chamo o atributo ou crio um método para mostrar as informações
        System.out.println("Conta c: "+c.titular);
        System.out.println(c.mostraDados());   */

    }

}