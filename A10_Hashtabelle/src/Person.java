import java.text.SimpleDateFormat;
import java.util.*;

public class Person implements Comparable<Person>{
	String vorName;
	String nachName;
	GregorianCalendar gebDatum;
	SimpleDateFormat sdf = new SimpleDateFormat("d.MMMM.yyyy");
	public Person(String vn , String nn , GregorianCalendar gebD ){
		this.vorName = vn;
		this.nachName = nn;
		this.gebDatum = gebD;
	}
	public String name(){
		return this.vorName+" "+this.nachName;
	}
	public String sortName(){
		for(int i = 0 ; i <this.vorName.length() ; i++){
			if((int)this.vorName.charAt(i) < (int) this.nachName.charAt(i)){
				return this.vorName +" "+this.nachName;
			}
			if((int)this.vorName.charAt(i) > (int) this.nachName.charAt(i)){
				return this.nachName +" "+this.vorName;
			}
		}
		return this.vorName +" "+ this.nachName;
	}
	public String toString(){
		return this.sortName() +" " + this.gebDatum.get(this.gebDatum.YEAR) + "." +this.gebDatum.get(this.gebDatum.MONTH)+"."+this.gebDatum.get(this.gebDatum.DAY_OF_MONTH);
	}
	public String getVorName(){
		return this.vorName;
	}
	public String getNachName(){
		return this.nachName;
	}
	public GregorianCalendar getGebDatum(){
		return this.gebDatum;
	}
	public String getSvnr(){
		return SVNr.createSvnr(this.gebDatum);
	}
	public int compareTo(Person p){
		if(this.gebDatum.getTimeInMillis() < p.gebDatum.getTimeInMillis()){
			return 1;			
		}
		
		if(this.gebDatum.getTimeInMillis() > p.gebDatum.getTimeInMillis()){
			return -1;
		}
		return 0;
   }
}
