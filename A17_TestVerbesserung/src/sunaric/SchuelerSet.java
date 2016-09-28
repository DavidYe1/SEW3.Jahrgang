package sunaric;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * klasse ShcuelerSet
 * @author Dragana Sunaric
 * version 14.1.2016
 */
public class SchuelerSet implements Iterable<Schueler>{
	private int size;
	private ArrayList<Schueler> as;
	/**
	 * Konstruktor
	 * @param size
	 */
	public SchuelerSet(int size){
		this.size = size;
		this.as = new ArrayList<Schueler>();
	}
	/**
	 * fürgt Schueler zur Liste hinzu
	 * @param s
	 * @return
	 */
	public boolean add(Schueler s){
		if(this.contains(s))return false;
		if(as.size() == this.size)throw new IllegalStateException("Set ist voll!");
		as.add(s);
		return true;
	}
	/**
	 * entfernt schueler
	 * @param s
	 * @return
	 */
	public boolean remove(Schueler s){
		return as.remove(s);
	}
	/**
	 * gibt zurück ob liste leer ist
	 * @return
	 */
	public boolean isEmpty(){
		return as.isEmpty();
	}
	/**
	 * gibt zurück ob liste voll ist
	 * @return
	 */
	public boolean isFull(){
		if(as.size() == this.size)return true;
		return false;
	}
	/**
	 * gibt iterator zurück
	 */
	public Iterator<Schueler> iterator(){
		return as.iterator();
	}
	/**
	 * FEHLER (wahrschienlich)
	 * @param s
	 * @return
	 */
	public boolean contains(Schueler s){
		return as.contains(s);
	}
}
