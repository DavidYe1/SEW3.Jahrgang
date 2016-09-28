/**
 * Testklasse für die LinkedList
 * @author Dragana Sunaric
 * @version 2015.12.03
 */
public class LinkedListTest {
	/**
	 * Main Methode
	 * @param args
	 */
	public static void main(String []args){
		MyLinkedList<Schueler> ll = new MyLinkedList<Schueler>();
		for(int i = 0 ; i < 100 ; i++){
			ll.add(new Schueler("Schueler"+i, "Schueler"+i,true));
		}
		System.out.println("ich bin nicht abgestürzt YUHU!");
		for(Schueler item : ll){
			System.out.println(item.getFamName());
		}
		System.out.println("ich bin noch immer nicht abgestürzt YUHU!");
	}
}
