package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	private String nomeCurso;
	private List<Aluno> listAluno = new ArrayList<>();
	
	public Curso(String nomeCurso) {
		super();
		this.nomeCurso = nomeCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public void addAluno(Aluno aluno) {
		listAluno.add(aluno);
	}
	
	public void getAlunos() {
		for(Aluno x: this.listAluno) {
			System.out.println(x.getCodAluno());
		}
	}
	@Override
	public String toString() {
		return "Curso " + nomeCurso + " Alunos = " + listAluno.toString();
	}	
	
}
