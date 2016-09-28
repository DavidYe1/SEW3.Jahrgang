import java.util.*;
public class PersonenTest {
	private Hashtable ht1 = new Hashtable<String , Person>();
	private Hashtable ht2 = new Hashtable<String , Person>();
	private ArrayList s1 = new ArrayList<String>();		//Aufgrund dessen wie ich die Zufälligen Personen generiert habe 
	private ArrayList s2 = new ArrayList<String>();		//brauch ich einen Array um den namen / gebDatum zu speichern 
	public PersonenTest(){
		createPersons();
		printPersons();
		deletePersons();
		sortPersons();
	}
	public void createPersons(){
		Random randomGenerator = new Random();
		System.out.println("Personen werden hinzugefügt:");
		for(int i = 0 ; i < 30 ; i++){
			Person p1 = new Person(Long.toHexString(Double.doubleToLongBits(Math.random())) , Long.toHexString(Double.doubleToLongBits(Math.random())) , new GregorianCalendar(2015 - (int)(Math.random()*100),(int)(Math.random()*12)+1,(int)(Math.random()*31)+1));
			s1.add(p1.sortName());
			s2.add(p1.getSvnr());
			ht1.put(p1.getSvnr(), p1);
			ht2.put(p1.sortName(), p1);
		}
		System.out.println("ht1:  " + ht1.size());
		System.out.println("ht2:  " + ht2.size());
	}
	public void deletePersons(){
		System.out.println("=================================");
		System.out.println("Personen werden aus ht1 gelöscht:");
		System.out.println(s1.get(4).toString());
		System.out.println(s1.get(1).toString());
		ht1.remove(s1.get(4));
		ht1.remove(s1.get(1));
		System.out.println("_________________________________");
		System.out.println("Personen werden aus ht1 gelöscht:");
		System.out.println(s1.get(4).toString());
		System.out.println(s1.get(1).toString());
		ht1.remove(s1.get(4));
		ht1.remove(s1.get(1));
	}
	public void printPersons(){
		System.out.println("=============================");
		System.out.println("Personen werden ausgegeben:");
		ArrayList<Person> ar = new ArrayList<Person>(ht1.values()); 
		for(int i = 0 ; i < ar.size();i++){
			System.out.println(ar.get(i).toString());
		}
	}
	public void sortPersons(){
		System.out.println("=======================================");
		System.out.println("Personen werden Sortiert und ausgegeben:");
		ArrayList<Person> ar = new ArrayList<Person>(ht1.values());
		Collections.sort(ar); 	//?? 
		for(int i = 0 ; i < ar.size();i++){
			System.out.println(ar.get(i).toString());
		}
		System.out.println("_________________________________________");
		ArrayList<Person> ar2 = new ArrayList<Person>(ht1.values());
		ar.sort(null);
		for(int i = 0 ; i < ar2.size();i++){
			System.out.println(ar2.get(i).toString());
		}
		
	}
	public static void main(String[]args){
		new PersonenTest();
	}
}
