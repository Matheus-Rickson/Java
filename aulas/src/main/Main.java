package main;

import java.util.Locale;
import java.util.Scanner;

import entities.retangulo;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		retangulo retangulo = new retangulo();

		System.out.println("Digite a base do retangulo: ");
		retangulo.base = sc.nextDouble();
		System.out.println("Digite a altura do retangulo: ");
		retangulo.altura = sc.nextDouble();

		System.out.println("A �rea desse retangulo �:  " + retangulo.Area());
		System.out.println("O perimetro desse retangulo �:  " + retangulo.Perimetro());
		System.out.println("A diagonal desse retangulo �:  " + retangulo.Diagonal());
		sc.close();

	}

}
