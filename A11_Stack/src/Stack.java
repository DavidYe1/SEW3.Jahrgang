/**
 * Stack - Class
 * @author Sunaric , Ceylan , Bosnjak
 * @param <E>
 */
public class Stack<E>{
	private Object elements [] ;	
	private int nextFreeIndex = 0;
	/**
	 * Konstruktor
	 * @param size
	 */
	public Stack(int size){
		this.elements = new Object[size];
	}
	/**
	 * f�gt ein el hinzu 
	 * @param e
	 */
	public void push(E e){
		if(this.isFull())throw new IllegalStateException("Stack Full");
		this.elements[this.nextFreeIndex] = e;
		this.nextFreeIndex++;
	}
	/**
	 * gibt letztes el zur�ck und l�scht es aus dem Stack
	 * @return letztes el
	 */
	public E pop(){
		if(this.isEmpty())throw new IllegalStateException("Stack empty");
		E x = (E)this.elements[this.nextFreeIndex -1];
		this.nextFreeIndex--;
		this.elements[this.nextFreeIndex] = null;
		return x;
	}
	/**
	 * gibt letztes el zur�ck
	 * @return letztes el
	 */
	public E peek(){
		if(this.isEmpty())throw new IllegalStateException("Stack empty");
		return (E)this.elements[this.nextFreeIndex -1];
	}
	/**
	 * Gibt zur�ck ob sich elemente im Stack befinden
	 * @return true --> Stack leer | false --> Stack nciht leer
	 */
	public boolean isEmpty(){
		if(this.elements[0] != null)return false;
		return true;
	}
	/**
	 * Gibt zur�ck ob der Stack voll ist 
	 * @return true --> Stack voll | false --> Stack nicht voll
	 */
	public boolean isFull(){
		if(this.elements[this.elements.length-1] != null)return true;
		return false;
	}
}
