package banco;

import java.util.Scanner;
import javax.swing.JOptionPane;
import banco.Conta;
import banco.Cliente;

public class Menu {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int op;
        Conta c1= new Conta(1, new Cliente(1, "Carol Primer", "12345678900", "carolprimer@mail.com"), 20000.50);
		Conta c2= null;
        
		System.out.print("*** BANQUINHO FÍSICO ***");
		System.out.println(" ");
		System.out.println("          MENU          ");
		System.out.println("1- Abrir conta");
		System.out.println("2- Sacar");
		System.out.println("3- Depositar");
		System.out.println("4- Transferir");
		System.out.println("5- Ver conta");
		System.out.println("0- Sair");
		System.out.println(" ");


		
		while(true) {
			System.out.println("Selecione uma opção: ");
			op= sc.nextInt();
			switch (op) {
			case 1:
				 String nome = JOptionPane.showInputDialog("Qual seu nome? ");
				 String cpf = JOptionPane.showInputDialog("Digite o seu CPF: ");
				 String email = JOptionPane.showInputDialog("Digite o seu e-mail: ");
				 System.out.println("Digite o seu saldo inicial: ");
				 float valor= sc.nextFloat();
				 Cliente cli=new Cliente(2, nome, cpf, email);
				 c2= new Conta(2, cli, valor);
				break;
			case 2:
				System.out.println("Digite o valor que pretende sacar: ");
				double val= sc.nextDouble();
				boolean saque= c2.sacar(val);
				if (saque){
					System.out.println("Saque realizado com sucesso.");
				}else {
					System.out.println("Você não tem saldo suficiente para realizar essa operação.");
				}
				break;
			case 3:
				System.out.println("Digite o valor que irá depositar: ");
				double dep= sc.nextDouble();
				c2.depositar(dep);
				System.out.println("Depósito realizado com sucesso!");
				break;
			case 4:
				System.out.println("Digite o valor que pretende transferir: ");
				double tranferencia= sc.nextDouble();
				boolean status= c2.transferir(tranferencia, c1);
				if (status){
					System.out.println("Transferência realizada com sucesso.");
				}else {
					System.out.println("Você não tem saldo suficiente para realizar essa operação.");
					break;
				}
				break;
			case 5:
				System.out.println(c2.mostraDados());
				break;
			case 0:
				System.out.println("Agradeçemos por usar nosso sistema.");
				return;
			default:
				System.out.println("Escolha uma opção válida.");
			}
		}
		
		
		


	}

}
