package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();

		System.out.println("Digite seu nome: ");
		funcionario.name = sc.nextLine();
		System.out.println("Digite seu salario bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.println("Digite a taxa de impostos a serem descontadas do salario: ");
		funcionario.taxa = sc.nextDouble();
		System.out.println("Digite a taxa(em %) de aumento no salario: ");
		funcionario.porcentagem = sc.nextInt();

		System.out.println(funcionario.name + "Com salário de: R$" + funcionario.salarioLiquido());
		System.out.println("Taxa aplicada ao salário: " + funcionario.porcentagem + "%");
		System.out.println("Após as mudanças: "+ funcionario.name + ", " + "R$" + funcionario.aumentarSalario());

		sc.close();
	}

}
