package Entidades;

import java.util.Date;

public class Usuario{
	private String nomeUsu;
	private Date dtLog;
	
	public Usuario(String nomeUsu, Date dtLog) {
		super();
		this.nomeUsu = nomeUsu;
		this.dtLog = dtLog;
	}
	
	public Usuario() {
	}

	public String getNomeUsu() {
		return nomeUsu;
	}

	public void setNomeUsu(String nomeUsu) {
		this.nomeUsu = nomeUsu;
	}

	public Date getDtLog() {
		return dtLog;
	}

	public void setDtLog(Date dtLog) {
		this.dtLog = dtLog;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeUsu == null) ? 0 : nomeUsu.hashCode());
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
		Usuario other = (Usuario) obj;
		if (nomeUsu == null) {
			if (other.nomeUsu != null)
				return false;
		} else if (!nomeUsu.equals(other.nomeUsu))
			return false;
		return true;
	}
}
