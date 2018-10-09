package repository;

import java.util.List;


import model.Ruolo;

public interface RepositoryRuolo {
	
	public boolean creaRuolo(Ruolo ruolo);
	public boolean cancellaRuolo(int id);
	public boolean aggiornaRuolo(Ruolo ruolo);
	public List<Ruolo> listaRuoli();
}
