/**
 * Testklasse für die Klasse AllgemeineListe<E e> und SchuelerIO
 * @author Dragana Sunaric
 * @version 2015/10/20
 */
public class SchuelerlisteGernerischTest {
	/**
	 * main - methode
	 * @param args
	 */
	public static void main(String []args){
		AllgemeineListe <Schueler> sl = new AllgemeineListe();
		Schueler s1 = new Schueler();
		s1.setFamName("Müller");
		s1.setGebDatum("14.05.1996");
		s1.setGeschlecht(false);
		s1.setVorName("Simon");
		
		Schueler s2 = new Schueler();
		s2.setFamName("Bauer");
		s2.setGebDatum("19.09.2000");
		s2.setGeschlecht(false);
		s2.setVorName("Peter");
		
		Schueler s3 = new Schueler();
		s3.setFamName("Sunaric");
		s3.setGebDatum("12.08.1999");
		s3.setGeschlecht(true);
		s3.setVorName("Dragana");
		
		sl.add(s1);
		sl.add(s2);
		sl.add(s3);
		
		System.out.println(sl.toString());
		
		SchuelerIO.schreiben(sl,"halloIchBinEineDatei");
		AllgemeineListe <Schueler> s4 = SchuelerIO.lesen("halloIchBinEineDatei");
		System.out.println(s4.toString());
	}
}
