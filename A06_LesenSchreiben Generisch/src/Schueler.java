import java.text.*;
import java.util.*;
/**
 * schueler Model Klasse , welche Attribute für Vorname , Nachname , 
 * Geschlecht und Gebutrsdatum enthält.
 * 
 * @author Draggy
 * @version 2015/09/11
 */
public class Schueler{
	private String famName;	//familienname
	private String vorName;	//Vorname
	private boolean gesch;	//true = weiblich , false = männlich
	private Date gebDatum;	//Geburtsdatum
	/**
	 * Methode , um das Datum zu setzen
	 * @param datum , das zu setzende Datum
	 * @return 	true - wenn das Datum erfolgreich gesettet wurde 
	 * 			false - wenn nicht 
	 */
	public boolean setGebDatum(String datum){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try{
			this.gebDatum = sdf.parse(datum);
		}catch(Exception e){
			return false;
		}
		return true;
	}
	/**
	 * Methode welche den Familiennamen zurückgibt
	 * @return den Familiennamen
	 */
	public String getFamName() {
		return this.famName;
	}
	/**
	 * Methode welche den Vornamen zurückgibt
	 * @return den Vornamen
	 */
	public String getVorName() {
		return this.vorName;
	}
	/**
	 * Methode welche das Geschlecht zurückgibt
	 * @return 	true - weiblich
	 * 			false - männlich
	 */
	public String getGeschlecht() {
		if(this.gesch) return "weiblich";
		return "maennlich";
	}
	/**
	 * Methode welche das Geburtdatum als String zurückgibt
	 * @return das Geburtsdatum
	 */
	public String getGebDatum() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		return sdf.format(this.gebDatum);
	}
	/**
	 * Methode welche alle Attribute in der Konsole ausgibt
	 */
	public String toString(){
		String s1 = this.famName + " " + this.vorName + " "  + this.getGebDatum();
		if(this.gesch) s1 += "  w";
		if(!this.gesch) s1 += "  m";
		return s1;
	}
	/**
	 * setter Methode für den Familienname
	 * @param famName , der zu setzende Familienname
	 */
	public void setFamName(String famName){
		this.famName = famName;
	}
	/**
	 * setter Methode für den Vornamen
	 * @param vorName , der zu setzende Vorname
	 */
	public void setVorName(String vorName){
		this.vorName = vorName;
	}
	/**
	 * setter Methode für das geschlecht
	 * @param gesch , das zu setzende Geschlecht (true - weiblich | false - männlich)
	 */
	public void setGeschlecht(boolean gesch){
		this.gesch = gesch;
	}
}
