package Programa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import Entidades.Aluno;
import Entidades.Curso;

public class ProgramaPortal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Aluno> alunos = new HashSet<>();
		Curso cursoA = new Curso("A");
		Curso cursoB = new Curso("B");
		Curso cursoC = new Curso("C");

		System.out.print("Quantidade de Alunos no curso A?");
		int qtdAlunos = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < qtdAlunos; i++) {
			System.out.print("Código do aluno A . #" + (i + 1) + " : ");
			Integer codAluno = sc.nextInt();
			sc.nextLine();
			Aluno aluno = new Aluno(codAluno);
			alunos.add(aluno);
			cursoA.addAluno(aluno);
		}

		System.out.print("Quantidade de Alunos no curso B?");
		qtdAlunos = sc.nextInt();
		for (int i = 0; i < qtdAlunos; i++) {
			System.out.print("Código do aluno B . #" + (i + 1) + " : ");
			Integer codAluno = sc.nextInt();
			sc.nextLine();
			Aluno aluno = new Aluno(codAluno);
			alunos.add(aluno);
			cursoB.addAluno(aluno);
		}

		System.out.print("Quantidade de Alunos no curso C?");
		qtdAlunos = sc.nextInt();
		for (int i = 0; i < qtdAlunos; i++) {
			System.out.print("Código do aluno C . #" + (i + 1) + " : ");
			Integer codAluno = sc.nextInt();
			sc.nextLine();
			Aluno aluno = new Aluno(codAluno);
			alunos.add(aluno);
			cursoC.addAluno(aluno);
		}

		System.out.println("Quantidade de Alunos nos Cursos : "+ alunos.size());
		System.out.println(cursoA);
		System.out.println(cursoB);
		System.out.println(cursoC);
		sc.close();
	}

}
