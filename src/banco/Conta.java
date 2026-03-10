package banco;

public class Conta {
	public int numero;
    public Cliente titular;
    public double saldo;
    public Conta(int n, Cliente tit, double saldo){
        this.numero=n;
        this.titular=tit;
        this.saldo=saldo;
    }
    public void depositar(double valor){
        this.saldo+=valor;
    }
    public boolean sacar(double valor){
        if(this.saldo >= valor){
            this.saldo-=valor;
            return true;
        }else{
            return false;
        }
    }
    public boolean transferir(double valor, Conta destino){
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }else{
            return false;
        }
    }
    public String mostraDados(){
        return "\n Conta Numero: "+this.numero+
                "\n "+ this.titular.mostraDados()+
                "\n Saldo: R$ "+this.saldo;
    }

}
