package entities;

public class retangulo {

	public double base;
	public double altura;

	public double Area() {
		return base * altura;
	}

	public double Perimetro() {
		return 2 * (base + altura);

	}

	public double Diagonal() {
		double d;
		return d = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

	}
}
