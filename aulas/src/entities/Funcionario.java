package entities;

public class Funcionario {

	public String name;
	public double salarioBruto;
	public double taxa;
	public int porcentagem;

	public double salarioLiquido() {
		return salarioBruto - taxa;

	}

	public double aumentarSalario() {
		double aumento;
		aumento = (salarioBruto * porcentagem) / 100 ;

		return (salarioBruto + aumento) - taxa;
	}

}
