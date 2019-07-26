package Entidades;

import java.util.Set;

public class Instrutor {
	private String nomeInst;
	private Set<Curso> setCursos;
	
	public Instrutor(String nomeInst, Set<Curso> setCursos) {
		super();
		this.nomeInst = nomeInst;
		this.setCursos = setCursos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeInst == null) ? 0 : nomeInst.hashCode());
		result = prime * result + ((setCursos == null) ? 0 : setCursos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Instrutor other = (Instrutor) obj;
		if (nomeInst == null) {
			if (other.nomeInst != null)
				return false;
		} else if (!nomeInst.equals(other.nomeInst))
			return false;
		if (setCursos == null) {
			if (other.setCursos != null)
				return false;
		} else if (!setCursos.equals(other.setCursos))
			return false;
		return true;
	}

	public String getNomeInst() {
		return nomeInst;
	}

	public void setNomeInst(String nomeInst) {
		this.nomeInst = nomeInst;
	}

	public Set<Curso> getSetCursos() {
		return setCursos;
	}

	public void setSetCursos(Set<Curso> setCursos) {
		this.setCursos = setCursos;
	}
	
	
}
