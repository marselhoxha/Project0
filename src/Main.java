import model.Impiegato;
import model.Ruolo;
import repository.RepositoryImpiegato;

import java.util.ArrayList;
import java.util.List;

import dao.ImpiegatoDao;
import dao.RuoloDao;

public class Main {
	
	private static ImpiegatoDao rp = new ImpiegatoDao();
	
	private static RuoloDao rd = new RuoloDao();
	
	public static void main(String[] args) {
		
			Impiegato i = new Impiegato();
			i.setNome("Mario");
			i.setCognome("Rossi");
			i.setId(1);
			rp.creaImpiegato(i);
			
			Impiegato i1 = new Impiegato();
			i1.setNome("Andrea");
			i1.setCognome("Bruni");
			i1.setId(2);
			rp.creaImpiegato(i1);
			
			Impiegato i2 = new Impiegato();
			i2.setNome("Antonio");
			i2.setCognome("Verdi");
			i2.setId(3);
			rp.creaImpiegato(i2);
			
			
			List<Impiegato> lista = new ArrayList<Impiegato>();
			lista = rp.listaImpiegati();
				for(Impiegato impiegato : lista) {
					System.out.println("Id : " + impiegato.getId());
					System.out.println("Nome : " + impiegato.getNome());
					System.out.println("Cognome : " + impiegato.getCognome());
					System.out.println("--------------------------------------");
				}
			rp.cancellaImpiegato(2);
			
			
			for(Impiegato impiegato : lista) {
				System.out.println("+++++++++++++++++++++++++++++++++++++++");
				System.out.println("Id : " + impiegato.getId());
				System.out.println("Nome : " + impiegato.getNome());
				System.out.println("Cognome : " + impiegato.getCognome());
				
			}
			rp.aggiornaImpiegato(i2);
			i2.setNome("AAAAAAAA");
			i2.setCognome("BBBBBBBB");
			//i2.setId(5);
			for(Impiegato impiegato : lista) {
				System.out.println("--------------------------------------");
				System.out.println("Id : " + impiegato.getId());
				System.out.println("Nome : " + impiegato.getNome());
				System.out.println("Cognome : " + impiegato.getCognome());
				System.out.println("--------------------------------------");
			}
		
		List<Ruolo> listaRuolo = new ArrayList<Ruolo>();
		listaRuolo = rd.listaRuoli();
		Ruolo r = new Ruolo();
		r.setNome("Programmatore");
		r.setStipendio(20000);
		r.setIdRuolo(1);
		rd.creaRuolo(r);
		
		Ruolo r1 = new Ruolo();
		r1.setNome("Team Leader");
		r1.setStipendio(20000);
		r1.setIdRuolo(2);
		rd.creaRuolo(r1);
		
		for(Ruolo ruolo : listaRuolo) {
			System.out.println("Id : " + ruolo.getIdRuolo());
			System.out.println("Nome : " + ruolo.getNome());
			System.out.println("Stipendio: " + ruolo.getStipendio());
			System.out.println("--------------------------------------");
		}
	}
}