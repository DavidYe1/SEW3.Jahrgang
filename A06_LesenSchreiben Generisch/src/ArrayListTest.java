import java.util.*;
/**
 * Testklasse für SchuelerIO 
 * @author Dragana Sunaric
 * @version 2015/10/05
 */
public class ArrayListTest {
	/**
	 * Main methode
	 * @param args
	 */
	public static void main(String [] args){
		ArrayList <Schueler> sl = new ArrayList();
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
		
		sl.add(s1);
		sl.add(s2);
		sl.add(s3);
		
		SchuelerIO.schreiben(sl,"IchBinEineDatei");
		
		ArrayList<Schueler> sl2 = SchuelerIO.lesen("IchBinEineDatei");
		System.out.println(sl2.toString());
	}
}
