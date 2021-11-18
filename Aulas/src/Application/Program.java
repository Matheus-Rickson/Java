package Application;

import java.util.Locale;
import java.util.Scanner;

import Utilitarios.Conversor;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o valor do Dólar: ");
		Conversor.dolar = sc.nextDouble();
		System.out.println("Quantos R$ quer comprar? ");
		Conversor.real = sc.nextDouble();
		System.out.println("Comprado e convertido. R$" + Conversor.ValorFinal());

		sc.close();

	}
}
