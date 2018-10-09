package dao;

import java.util.ArrayList;
import java.util.List;

import model.Impiegato;
import model.Ruolo;
import repository.RepositoryImpiegato;
import repository.RepositoryRuolo;

public class RuoloDao implements RepositoryRuolo{
	
	List<Ruolo> lista = new ArrayList<Ruolo>();
	
	public boolean creaRuolo(Ruolo ruolo) {
		try {

			lista.add(ruolo);

		} catch (Exception e) {
			return false;
		}

		return true;
	}
	
	public boolean cancellaRuolo(int idRuolo) {

		for (Ruolo ruolo : lista) {
			if (ruolo.getIdRuolo() == idRuolo) {
				lista.remove(ruolo);
			}
		}

		return false;
	}
	
	public boolean aggiornaRuolo(Ruolo ruolo) {

		for (Ruolo ruolo1 : lista) {
			if (ruolo1.getIdRuolo() == ruolo.getIdRuolo()) {
				
				lista.remove(ruolo1);
				lista.add(ruolo);
			}
		}
		return false;
	}
	
	public List<Ruolo> listaRuoli() {
		return this.lista;
	}
}
