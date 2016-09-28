package sunaric;

import java.util.HashMap;
/**
 * Testklasse Schueler
 * @author Dragana Sunaric
 *
 */
public class HashBeispiel {
	public static void main(String [] args){
		HashMap<String,Schueler> hs = new HashMap<String,Schueler>();
		//hinzufügen der Objekte
		for(int i = 1 ; i < 16 ; i++){
			Schueler s1 = new Schueler("Max"+i,23-i);
			hs.put(s1.getName(), s1);
		}
		//Ausgabe (für Testzwecke)
		for(int i = 1 ; i < 16 ; i++){
			System.out.println(hs.get("Max"+i).toString());
		}
	}
}
