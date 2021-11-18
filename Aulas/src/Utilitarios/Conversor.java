package Utilitarios;

public class Conversor {

	public static double dolar;
	public static double real;

	public static double ValorFinal() {
		double calculo;
		calculo = ((dolar * real) * 6) / 100;
		return (dolar * real) + calculo;

	}

}
