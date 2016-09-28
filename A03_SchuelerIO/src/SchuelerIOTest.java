import java.util.*;
/**
 * Test Klasse für die Klassen :  Schueler , Schuelerliste , SchuelerIO
 * @author Dragana Sunaric
 * @version 21/09/2015
 */
public class SchuelerIOTest {
	/**
	 * main - methode
	 * @param args
	 */
	public static void main(String [] args){
		Schuelerliste sl = new Schuelerliste();
		Schueler s1 = new Schueler();
		s1.setFamName("Müller");
		s1.setGebDatum("14-05-1996");
		s1.setGeschlecht(false);
		s1.setVorName("Simon");
		
		Schueler s2 = new Schueler();
		s2.setFamName("Bauer");
		s2.setGebDatum("19-09-2000");
		s2.setGeschlecht(false);
		s2.setVorName("Peter");
		
		Schueler s3 = new Schueler();
		s3.setFamName("Sunaric");
		s3.setGebDatum("12-08-1999");
		s3.setGeschlecht(true);
		s3.setVorName("Dragana");
		
		sl.addSchueler(s1);
		sl.addSchueler(s2);
		sl.addSchueler(s3);
		
		SchuelerIO.schreiben(sl,"IchBinEineDatei");
		
		Schuelerliste sl2 = SchuelerIO.lesen("IchBinEineDatei");
		
		System.out.println(sl2.printAll());
	}
}
