/**
 * Testklasse 1
 * @author Dragana Sunaric
 * @version 2015/09/25
 */
public class test1 {
	/**
	 * main Methode
	 * @param args
	 */
	public static void main(String args[]){
		ObjektSpeicher<Schueler> os = new ObjektSpeicher(5);
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
		
		os.add(s1 , 0);
		os.add(s2 , 1);
		os.add(s3 , 2);
		
		System.out.println(os.toString());
	}
}
