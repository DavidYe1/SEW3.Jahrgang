/**
 * Klasse um einen Array eines beliebigen Typs E zu verwalten
 * @author Dragana Sunaric
 * @version 2015/09/25
 * @param <E>
 */
public class ObjektSpeicher <E>{
	private Object [] obj;
	/**
	 * Konstruktor welcher ein Array erstellt 
	 * @param size , groesse des arrays
	 */
	public ObjektSpeicher(int size){
		this.obj = new Object [size];
	}
	/**
	 * Fuegt ein Elemnt hinzu (ueberschreibt das Element auf der position pos)
	 * @param e
	 * @param pos
	 */
	public void add(E e , int pos){
		this.obj[pos] = e;
	}
	/**
	 * Getter fuer ein einzelnes Element
	 * @param position
	 * @return das Element auf der position pos
	 */
	public E get(int position){
		return (E) this.obj[position];
	}
	/**
	 * Getter fuer die groesse des Arrays
	 * @return die groesse des arrays
	 */
	public int size(){
		return this.obj.length;
	}
	/**
	 * Gibt die Anzahl der beschriebenen Elemente im Array zurueck
	 * @return
	 */
	public int numberOfElements(){
		int i1 = 0;
		for(int i = 0 ; i < this.obj.length ; i++){
			if(this.obj[i] == null){
				i1++;
			}
		}
		return i1;
	}
	/**
	 * Gibt info aller Elemente als String zurueck
	 */
	public String toString(){
		String s1 = "";
		for(int i = 0 ; i < this.obj.length; i++){
			if(this.get(i)!= null){
				s1 += this.get(i).toString() + "\n\r";
			}
		}
		return s1;
	}
}
