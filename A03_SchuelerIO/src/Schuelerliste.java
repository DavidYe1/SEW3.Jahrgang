/**
 * Klasse zum verwalten von mehreren Schuelern
 * @author Dragana Sunaric
 * @version 2015/09/17
 */
public class Schuelerliste {
	private Schueler [] s; // ein array von objekten der klasse schueler
	/**
	 * erstellt ein neues objekt der klasse schueler mit einer leeren liste von schuelern
	 */
	public Schuelerliste(){
		this.s = new Schueler[0];
	}
	/**
	 * fügt einen Schueler hinzu
	 * @param s1
	 */
	public void addSchueler(Schueler s1){
		Schueler[] neu = new Schueler[this.s.length+1];
		for(int i = 0 ; i < this.s.length ; i++){
			neu[i] = this.s[i];
		}
		neu [neu.length-1] = s1;
		this.s = neu;
	}
	/**
	 * entfernt einen Schueler aus dem Schuelerarray
	 * @param s1
	 */
	public void removeSchueler(Schueler s1){
		Schueler[] neu = new Schueler[this.s.length-1];
		boolean b1 = true;
		for(int i = 0 ; i < this.s.length - 2 ; i++){
			if(s1.equals(this.s[i]))b1=false;
			else if(b1) neu[i] = this.s[i];
			else if(!b1)neu[i-1] = this.s[i];
		}
		this.s = neu;
	}
	/**
	 * gibt die länge des Arrays zurück 
	 * @return 
	 */
	public int anzahl(){
		return this.s.length;
	}
	/**
	 * gibt einen neuen SchuelerIterator an den aufrufer zurueck
	 */
	public SchuelerIterator get(){
		return new MyIter(this.s);
	}
	/**
	 * returns information about ever Schueler object as a String
	 */
	public String printAll(){
		String s1 = "";
		for(int i = 0 ; i < this.s.length ; i++){
			s1 += this.s[i].printAll() + "\n";
		}
		return s1;
	}
	/**
	 * eigene iteratorklasse, die die klasse SchuelerIterator implementiert
	 */ 
	private class MyIter implements SchuelerIterator{
		private Schueler [] li; // ein array von objekten der klasse schueler
		private int index;
		
		/**
		 * erstellt ein neues objekt der klasse myiter mit dem index 0
		 * @param l liste von objekten der klasse schueler
		 */
		private MyIter(Schueler[] l){
			li = l.clone(); // erstellt ein neues schueler array gleicher groeße und kopiert jedes einzelne element
			index = 0;
		}
		
		/**
		 * gibt das element an der stelle des indexes zurueck und stellt diesen danach um eins weiter
		 * @return schueler objekt an der stelle index
		 */
		public Schueler next(){
			Schueler s = li [index]; // schueler an der stelle temporaer speichern
			index++;
			return s;
		}
		
		/**
		 * zur abfrage, ob es ein nächstes element gibt
		 * @return true, wenn es ein weiteres element im array ist, ansonsten false
		 */
		public boolean hasNext(){
			return index < li.length;
		}
	}
}
