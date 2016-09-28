import java.util.*;
import java.io.*;
/**
 * Klasse zum lesen von autodaten aus einer Datei
 * @author Dragana Sunaric
 * @version 22.10.2015
 */
public class Autodaten {
	/**
	 * Liest autodaten aus einer daten
	 * @param dateiname
	 * @return
	 */
	public static ArrayList<Auto> lesen(String dateiname){
		ArrayList<Auto> a = new ArrayList ();
		try{
			File f = new File(dateiname); 
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()){
				String s = sc.nextLine();
				String sa [] = s.split(" ");
				Auto a1 = new Auto();
				a1.setMarke(sa[0].split("=")[1]);
				a1.setpS(Integer.parseInt(sa[1].split("=")[1]));
				a1.setKennzeichen(sa[2].split("=")[1]);
				a1.setBaujahr(Integer.parseInt(sa[3].split("=")[1]));
				a.add(a1);
			}
			sc.close();
		}catch(IOException e){
			System.out.println("smthg went wrong!");
			
		}
		return new ArrayList<Auto>();
	}
}
