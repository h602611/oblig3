package no.hvl.dat100.jplab11.oppgave3;
import java.util.*;
import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
		nesteledig = 0;
		innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		return innleggtabell.length - Collections.frequency(Arrays.asList(innleggtabell), null);
	}
	
	public Innlegg[] getSamling() {
		// En metode public Innlegg[] getSamling() som returnerer en peker til tabellen av innlegg-objekt.
		
		return innleggtabell;
		
	}
	
	public int finnInnlegg(Innlegg innlegg) {

		//En metode public int finnInnlegg(Innlegg innlegg) som returnerer indeks 
		//(posisjon) i tabellen for et innlegg i samlingen med samme id som parameteren innlegg 
		//(om en slik finnes) og -1 ellers. Bruk erLik-metoden for Innlegg-objekt i implementasjonen
		
		for(int i = 0; i < innleggtabell.length; i++) {
			if(innleggtabell[i].erLik(innlegg)) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		
		for(Innlegg innleggO : innleggtabell) {
			if(innleggO.erLik(innlegg)) {
				return true;
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		
		if(innleggtabell[innleggtabell.length - 1]!= null) {
			return false;
		} 
		return true;
		
	}
	
	public boolean leggTil(Innlegg innlegg) {

		if(ledigPlass()) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		}
		return false;
		
	}
	
	public String toString() {
		//String str = "2\n" + 
				//"TEKST\n1\nOle Olsen\n23-10\n0\nen tekst\n" + 
				//"BILDE\n2\nOline Olsen\n24-10\n0\net bilde\nhttp://www.picture.com/oo.jpg\n";
		return innleggtabell.toString();
		
		
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		
		Innlegg [] nyinnleggtabell = new Innlegg[innleggtabell.length*2];
		for (int i = 0; i < innleggtabell.length; i++) {
			nyinnleggtabell[i] = innleggtabell[i];
		}
		innleggtabell = nyinnleggtabell;
	}
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}