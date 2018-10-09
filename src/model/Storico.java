package model;

import java.util.Date;

public class Storico {
	
	private int idRuolo;
	private int idImpiegato;
	private Date dataInizio;
	private Date dataFine;
	
	public Storico(){
		
	}
	
	public int getIdRuolo() {
		return idRuolo;
	}
	public void setIdRuolo(int idRuolo) {
		this.idRuolo = idRuolo;
	}
	public int getIdImpiegato() {
		return idImpiegato;
	}
	public void setIdImpiegato(int idImpiegato) {
		this.idImpiegato = idImpiegato;
	}
	public Date getDataInizio() {
		return dataInizio;
	}
	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}
	public Date getDataFine() {
		return dataFine;
	}
	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}

	@Override
	public String toString() {
		return "Storico [idRuolo=" + idRuolo + ", idImpiegato=" + idImpiegato + ", dataInizio=" + dataInizio
				+ ", dataFine=" + dataFine + "]";
	}
	
	

}
