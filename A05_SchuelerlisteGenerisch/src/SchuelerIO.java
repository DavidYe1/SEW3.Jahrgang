import java.io.*;
import java.util.*; 
public class SchuelerIO {
	/**
	 * Schreibt Schuelerdaten in Datei
	 * @param sl
	 * @param dateiname
	 */
	public static void schreiben(AllgemeineListe<Schueler> al , String dateiname){
		 try {       
			 File f = new File(dateiname);       
			 PrintWriter pw = new PrintWriter (f);
			 GeneralIterator si = al.get();
			 while(si.hasNext()){
				 pw.println(si.next().toString());
			 }
			 pw.close();
			 }catch (IOException e) {
				 System.out.println("FEHLER");
				 e.printStackTrace();
			 }
		}
	/**
	 * Liest Schuelerdaten aus Datei
	 * @param dateiname
	 */
	public static AllgemeineListe<Schueler> lesen(String dateiname){
		AllgemeineListe<Schueler> sl = new AllgemeineListe();
		try {       
			File f = new File(dateiname);       
			Scanner s = new Scanner(f);       
			while (s.hasNextLine()) {          
				String l = s.nextLine();  
				
				String[] s1 = new String[4];
				Schueler sch1 = new Schueler();
				s1 = l.split(" ");
				
				sch1.setFamName(s1[0]);
				sch1.setVorName(s1[1]);
				sch1.setGebDatum(s1[2]);
				if(s1[4] == "m")sch1.setGeschlecht(false);
				if(s1[4] == "w")sch1.setGeschlecht(true);
				sl.add(sch1);
			}       
			s.close();    
		}catch (IOException e) {       
			e.printStackTrace(); 
			System.out.println("FEHLER");
		}catch (NullPointerException x){
			System.out.println("WHOOPSIIIEEEEEE!!!!!");
		}
		return sl;
	}
}
