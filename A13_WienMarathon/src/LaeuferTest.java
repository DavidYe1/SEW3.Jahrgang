import java.util.*;
/**
 * Testklasse zur Wahl der Datenstuktur
 * @author  Bosnjak Mateo, Ceylan Muhammed , Sunaric Dragana
 * @version 2015.12.3
 */
public class LaeuferTest {
	/**
	 * Main methode
	 * @param args , ohne Bedeutung
	 */
	public static void main(String[]args){
		System.out.println("Array List erg:");
		arrayListTest();
		System.out.println("Linked List erg:");
		linkedListTest();
		System.out.println("Hashset erg:");
		SetTest();
	}
	/**
	 * Testet die Geschwingigkeit der Arraylist
	 */
	public static void arrayListTest(){
		LaeuferFactory lf = new LaeuferFactory(10000);
		ArrayList<Laeufer> ar = new ArrayList<Laeufer>();
		//Erzeugen der einträge
		long t1 = System.nanoTime();
		for(int i = 0 ; ar.size() != 10000 ;i++){
			ar.add(lf.createClone());
		}
		long t2 = System.nanoTime();
		System.out.println(t2-t1);
		//zugriff auf arraylist
		t1 = System.nanoTime();
		for(int i = 0 ; i < ar.size();i++){
			ar.get(i);
		}
		t2 = System.nanoTime();
		System.out.println(t2-t1);
	}
	/**
	 * LinkedListTest b2
	 */
	public static void linkedListTest(){
		LaeuferFactory lf = new LaeuferFactory(10000);
		LinkedList<Laeufer> ll = new LinkedList<Laeufer>();
		//Erzeugen der einträge
		long t1 = System.nanoTime();
		for(int i = 0 ; ll.size() != 10000 ;i++){
			ll.add(lf.createClone());
		}
		long t2 = System.nanoTime();
		System.out.println(t2-t1);
		//zugriff auf LinkedList
		for(int i = 0 ; i < 10000 ; i++){
			ll.get(i);
		}
		t2 = System.nanoTime();
		System.out.println(t2-t1);
	}
	public static void SetTest(){
		LaeuferFactory lf = new LaeuferFactory(10000);
		HashSet<Laeufer> hs = new HashSet<Laeufer>();
		//Erzeugen der einträge
		long t1 = System.nanoTime();
		for(int i = 0 ; hs.size() != 10000 ;i++){
			hs.add(lf.createClone());
		}
		long t2 = System.nanoTime();
		System.out.println(t2-t1);
		//Zugriff auf Hashset
		t1 = System.nanoTime();
		for(Laeufer l : hs){
			l.toString();
		}
		t2 = System.nanoTime();
		System.out.println(t2-t1);
	}
}