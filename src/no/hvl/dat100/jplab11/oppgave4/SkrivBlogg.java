package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		String melding = "";
		try {
			String fil1 = ("utBlogg.txt");
			File fil = new File(fil1);
			PrintWriter skriver = new PrintWriter(fil1);
			
			Blogg[] innleggtabell = new Blogg[nesteledig];
			
			for (int i = 0; i < innleggtabell.length; i++) {
				skriver.println(innleggtabell[i]);
				
				skriver.close();
			}
		
		}
		
		catch (FileNotFoundException e) {
			melding = "Filen finnes ikke";
		}
	}
}

