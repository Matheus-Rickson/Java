package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		Aluno aluno = new Aluno();
		System.out.println("Digite o nome do aluno: ");
		aluno.nome = ler.nextLine();
		System.out.println("Digite a 1� nota: ");
		aluno.nota1 = ler.nextDouble();
		System.out.println("Digite a 2� nota: ");
		aluno.nota2 = ler.nextDouble();
		System.out.println("Digite a 3� nota: ");
		aluno.nota3 = ler.nextDouble();

		if (aluno.notaAluno() >= 90.00) {
			System.out.println("Sua m�dia final foi: " + aluno.notaAluno());
			System.out.println("Aluno aprovado! Boas f�rias.");
		} else {
			System.out.println("Aluno reprovado");
			System.out.println("Faltaram: " + (60 - aluno.notaAluno()) + " pontos" + " para a sua aprova��o.");
		}

		ler.close();
	}

}
