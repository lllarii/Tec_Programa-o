package banco;

import javax.swing.JOptionPane;
import banco.Conta;
import banco.Cliente;

public class Banco {

	public static void main(String[] args) {
		int op;
        int i=0;
        int num=-1;
        int destino=-1;
        double valor=0;
        boolean status= true;
        Conta[] contas= new Conta[10]; 
        contas[0]= new Conta(0, new Cliente(0, "Carol Primer", "12345678900", "carolprimer@mail.com"), 20000.50);
        Cliente[] clientes=new Cliente[10]; 
        String menu= "\n          MENU          "+"\n1- Abrir conta"+"\n2- Sacar"+"\n3- Depositar"+"\n4- Transferir\""
                + "\n5- Ver conta"+"\n0- Sair"+"\nSelecione uma opção: ";
        String msgSucesso= "Operação realizada com sucesso! Veja: ";
        String msgFalha= "Você não tem saldo suficiente para realizar essa operação.";
        do{
            op= Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op){
                case 1:
                    String nome = JOptionPane.showInputDialog("Qual seu nome? ");
                    String cpf = JOptionPane.showInputDialog("Digite o seu CPF: ");
                    String email = JOptionPane.showInputDialog("Digite o seu e-mail: ");
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu saldo inicial: "));
                    clientes[i]= new Cliente(i, nome, cpf, email);
                    contas[i]= new Conta(i, clientes[i], valor);
                    JOptionPane.showMessageDialog(null, msgSucesso);
                    JOptionPane.showMessageDialog(null, contas[i].mostraDados());
                    i= i+1;
                    break;
                case 2:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que pretende sacar: "));
                    num= Integer.parseInt(JOptionPane.showInputDialog("Digite o número da sua conta: "));
                        while (num > i){
                            num= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número de conta válido! "));
                        }
                    status= contas[num].sacar(valor);
				if (status){
					JOptionPane.showMessageDialog(null, msgSucesso);
                                        JOptionPane.showMessageDialog(null, "O seu saldo atual é: R$"+contas[num].saldo);
				}else {
					JOptionPane.showMessageDialog(null, msgFalha);
				}
                    break;
                case 3:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que irá depositar: "));
                    num= Integer.parseInt(JOptionPane.showInputDialog("Digite o número da sua conta: "));
                        while (num > i){
                            num= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número de conta válido: "));
                        }
                    contas[num].depositar(valor);
                    JOptionPane.showMessageDialog(null, msgSucesso);
                    JOptionPane.showMessageDialog(null, "O seu saldo atual é: R$"+contas[num].saldo);
                    break;
                case 4:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que pretende transferir: "));
                    num= Integer.parseInt(JOptionPane.showInputDialog("Digite o número da sua conta: "));
                    destino= Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta de destino: "));
                    while(num>i || destino>i || num==destino){
                        if (num > i){
                            num= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número de conta válido: "));
                        }
                        if (destino> i){
                            destino= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número de conta válido: "));
                        }
                        if (num == destino){
                            JOptionPane.showMessageDialog(null, "Você digitou o mesmo número de conta de origem e destino.");
                            num= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número de conta: "));
                            destino= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número de conta: "));
                        }
                    }
                    status= contas[num].transferir(valor, contas[destino]);
				if (status){
					JOptionPane.showMessageDialog(null, msgSucesso);
                                        JOptionPane.showMessageDialog(null, "O seu saldo atual é: R$"+contas[num].saldo);
				}else {
					JOptionPane.showMessageDialog(null, msgFalha);
				}
                break;
                case 5:
                    num= Integer.parseInt(JOptionPane.showInputDialog("Digite o número da sua conta: "));
                        while (num > i){
                            num= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número de conta válido: "));
                        }
                    JOptionPane.showMessageDialog(null, contas[num].mostraDados());
                break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Tchaaaau!");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
        }while(op != 0);
    }
}