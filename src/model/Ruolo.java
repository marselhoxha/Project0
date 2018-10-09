package model;


public class Ruolo {
		
	private int idRuolo;
	private String nome;
	private int stipendio;
	
	
	
	public Ruolo() {

	}
	
	public int getIdRuolo() {
		return idRuolo;
	}
	public void setIdRuolo(int idRuolo) {
		this.idRuolo = idRuolo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getStipendio() {
		return stipendio;
	}
	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}

	@Override
	public String toString() {
		return "Ruolo [idRuolo=" + idRuolo + ", nome=" + nome + ", stipendio=" + stipendio + "]";
	}
	
	
	
	
}
