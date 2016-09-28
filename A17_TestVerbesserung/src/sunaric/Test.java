package sunaric;

import java.util.HashMap;
/**
 * testklasse für SchuelerSet
 * @author Draggy
 *
 */
public class Test {
	/**
	 * testmethode
	 * @param args
	 */
	public static void main(String[]args){
		SchuelerSet ss = new SchuelerSet(15);
		//hinzufügen der Objekte
		for(int i = 1 ; i < 16 ; i++){
			Schueler s1 = new Schueler("Max"+i,23-i);
			ss.add(s1);
		}
		//entfernen 2er Objekte
		ss.remove(new Schueler("Max1",22));
		ss.remove(new Schueler("Max2",21));
		//ausgabe der Objekte
		for(Schueler item:ss){
			System.out.println(item.toString());
		}
		//Test : contains
		if(ss.contains(new Schueler ("Max13",22)))
			System.out.println("Schueler MAX 13 , 7 Jahre ist nicht in der liste");;
		if(ss.contains(new Schueler ("Max27",7)))
			System.out.println("Schueler MAX 27 , 7 Jahre ist nicht in der liste");
	}
}
