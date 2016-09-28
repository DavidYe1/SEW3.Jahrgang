/**
 * Testklasse für die Klasse Stack
 * @author Draggy
 * @version 19.11.2015
 */
public class test {
	/**
	 * main - Methode 
	 * @param args , keine Bedeutung
	 */
	public static void main(String args[]){
		String[] p1 = new String[3];
		p1 [0] = "1";
		p1 [1] = "2";
		p1 [2] = "3";
		for(int i = 0 ; i < 3 ; i++){
			System.out.println(p1[i]);
		}
		Stack<String> s1 = new Stack<String>(3);
		System.out.println(s1.isEmpty());
		s1.push(p1[0]);
		System.out.println(s1.isEmpty());
		System.out.println(s1.isFull());
		s1.push(p1[1]);
		s1.push(p1[2]);
		System.out.println(s1.isFull());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.peek());
		System.out.println(s1.pop());
	}
}
