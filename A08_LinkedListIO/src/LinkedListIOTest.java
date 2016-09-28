/**
 * testklasse für die Klasse LinkedListIO
 * @author Dragana Sunaric
 * @version 2015.12.05
 */
public class LinkedListIOTest {
	/**
	 * main methode
	 * @param args , ohne bedeutung
	 */
	public static void main(String[]args){
		MyLinkedList<Schueler> ll = new MyLinkedList<Schueler>();
		for(int i = 0 ; i < 100 ; i++){
			ll.add(new Schueler("Schueler"+i, "Schueler"+i,true));
		}
		System.out.println("ich bin nicht abgestürzt YUHU!");
		for(Schueler item : ll){
			item.setGebDatum("11-12-2000");
		}
		System.out.println("ich bin noch immer nicht abgestürzt YUHU!");
		LinkedListIO.schreiben(ll, "NeueDatei");
		MyLinkedList<Schueler> newll = LinkedListIO.lesen("neueDatei");
		for(Schueler item : newll){
			System.out.println(item.getFamName());
		}
		System.out.println("alles worked :) ");
	}
}
