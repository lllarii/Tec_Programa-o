package banco;

public class Funcionario {
	public double salario;
    double aumento;
    public void recebeAumento(double percentual){
        this.aumento= this.salario*percentual/100;
        this.salario+=this.aumento;               
    }
    public double calculaGanhoAnual(){
        double ganho= this.aumento*12;
        return ganho;}

}
