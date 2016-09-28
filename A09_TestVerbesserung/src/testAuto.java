import java.util.*;
import java.io.*;

/**
 * Testklasse für die Klassen Auto , Autotransport 
 * @author Dragana Sunaric
 * @verison 22.10.2015
 */
public class testAuto {
	public static void main(String [] args){
		//__________________________________________________
		// Test : Class Auto								
		Auto a1 = new Auto();								
															
		a1.setBaujahr(1999);
		a1.setKennzeichen("W-430");
		a1.setMarke("BMW");
		a1.setpS(200);
		
		System.out.println(a1.toString());
		ArrayList<Auto> a2= new ArrayList();
		a2.add(new Auto ("BMW" , 20 , "W-134" , 1998));
		a2.add(new Auto ("VW" , 110 , "W-134" , 1998));
		a2.add(new Auto ("BMW" , 110 , "W-134" , 1999));
		a2.add(new Auto ("BMW" , 40 , "W-134" , 1998));
		a2.sort(null);
		System.out.println(a2.toString());
		//_________________________________________________
		//Test : Class Autodaten
		ArrayList<Auto> ar = Autodaten.lesen("abc.txt");
		ar.toString();
		//_________________________________________________
		//Test : Class AutoTransport
		AutoTransport at = new AutoTransport(a2.get(0),a2.get(1),null);
		System.out.println(at);
		IteratorExtended<Auto> ia1 = at.iterator();
		ia1.insertAfter(new Auto("BMW", 30 , "W-444" , 1800));
		ia1.next();
		ia1.next();
		System.out.println(at);
	}
}
