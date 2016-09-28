import java.util.*;
/**
 * Class LinkedList
 * @author Dragana Sunaric
 * @version 2015.12.03
 * @param <E> type of Elements held in this collection 
 */
public class MyLinkedList<E> implements Iterable<E>{
	private Element first, last; 	//points to last and first Element of the Linkedlist
	/**
	 * constructor
	 */
	public MyLinkedList() {
		first = null;
		last = null;
	}
	/**
	 * adds an specific Element at the end of the LinkedList
	 * @param e , Element to add
	 */
	public void add(E e){
		if(last == null) {
			last = new Element(e);
			first = last;
		} else {
			Element newElem = new Element(e, null, last);
			newElem.previous.next = newElem;
			last = newElem;
		}
	}
	/**
	 * Adds an specific Element at a specific position of the LinkedList
	 * @param e
	 * @param index
	 */
	public void add(E e, int in){
		Element nE = this.first;
		if(in == 0){
			add(e);
		}
		for(int i = 0; i <= in; i++){
			if(i == in) {
				if(nE == this.last){
					add(e);
					return;
				}
			nE = new Element(e, nE, nE.previous);
			nE.next.previous = nE;
			nE.previous.next = nE;
			}
			nE = nE.next;
		}
	}
	/**
	 * Adds an specific Element at the First possition
	 * @param e
	 */
	public void addFirst(E e){
		if(this.first == null){
			add(e);
		}else{
			Element nE = new Element(e, this.first, null);
			nE.next.previous = nE;
			this.first = nE;
		}
	}
	/**
	 * Removes the first Element
	 * @return
	 */
	public E remove(){
		if(this.first == null)return null;
		E el = this.first.e;
		this.first.next.previous = null;
		this.first = this.first.next;
		if(first == null)
			this.last = null;
		
		return el;
	}
	/**
	 * removes an element an a specific position
	 * @param index
	 * @return the removed Element
	 */
	public E remove(int index){
		if(index == 0)return remove();
		Element nE = first;
		for(int i = 0; i <= index; i++){
			if(i == index) {
				if(nE == this.last){
					return removeLast();
				}
				nE.previous.next = nE.next;
				nE.next.previous = nE.previous;
				return nE.e;
			}
			nE = nE.next;
		}
		return null;
	}
	public E removeLast(){
		if(first == null)return null;
		E el = last.e;
		last.previous.next = null;
		last = last.previous;
		if(last == null)first = null;
		return el;
	}
	/**
	 * Returns a LinkedListIterator
	 */
	public Iterator<E> iterator() {
		return new LinkedListIter(); 
	}
	/**
	 * Element held in LinkedList 
	 * points to previous Element , next Element and its Object  
	 * @author Dragana Sunaric
	 * @version 2015.12.03
	 */
	private class Element { 
		private Element next, previous;
		private E e;
		/**
		 * Constructor , initials all attributes
		 * @param e			The Object it refers to
		 * @param next		The next Element
		 * @param previous	The previous Element
		 */
		public Element(E e, Element next, Element previous) {
			this.e = e;
			this.next = next;
			this.previous = previous;
		}
		/**
		 * Constructor
		 * @param e
		 */
		public Element(E e){
			this.e = e;
		}
	}
	private class LinkedListIter implements Iterator<E> {
		private Element next;			// next Element
		private Element returned;		//the last returned Element / current element
		/**
		 * Constructor
		 */
		public LinkedListIter() {
			next = first;
			returned = null;
		}
		/**
		 * Tells if there is a next el or not
		 */
		public boolean hasNext() {
			return next != null;
		}
		public E next() {
			if(!hasNext())throw new NoSuchElementException("Whooopsieeeee!!");
			returned = next;
			next = next.next;
			return returned.e;
		}
		public void remove() {
			if(returned == first){
				remove();
			}else if(returned == last){
				removeLast();
			}else{
				returned.previous.next = returned.next;
				returned.next.previous = returned.previous;	
			}
				
			returned = null;
		}
	}
	
}
