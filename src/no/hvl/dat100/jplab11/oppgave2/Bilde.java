package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	private int id;
	private String dato;
	private String bruker;
	private String tekst;
	private int likes;
	private String url;
	
	// TODO - objekt variable
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		this.id=id;
	    this.bruker = bruker;
	    this.dato=dato;
	    this.tekst= tekst;
	    this.likes = 0;
	    this.url = url;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		
		this.id=id;
	    this.bruker = bruker;
	    this.dato=dato;
	    this.likes=likes;
	    this.tekst= tekst;
	    this.url = url;
	}
	
	public String getUrl() {
		return url;

	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		
		return String.format("BILDE\n%s\n%s\n%s\n%s\n%s\n%s\n",id,bruker,dato,likes,tekst,url);

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
