/**
 * Modelklasse für auto
 * @author Dragana Sunaric
 * @version 22.10.2015
 */
public class Auto implements Comparable<Auto>{
	private String marke;
	private int pS;
	private String kennzeichen;
	private int baujahr;
	/**
	 * defoult construktor
	 */
	public Auto(){
		this.marke = null;
		this.pS = 0;
		this.kennzeichen = null;
		this.baujahr = 0;
	}
	/**
	 * Konstruktor der klasse auto
	 * @param marke
	 * @param pS
	 * @param kennzeichen
	 * @param baujahr
	 */
	public Auto(String marke , int pS , String kennzeichen , int baujahr){
		this.marke = marke;
		this.pS = pS;
		this.kennzeichen = kennzeichen;
		this.baujahr = baujahr;
	}
	/**
	 * @return the marke
	 */
	public String getMarke() {
		return this.marke;
	}
	/**
	 * @param marke the marke to set
	 */
	public void setMarke(String marke) {
		this.marke = marke;
	}
	/**
	 * @return the pS
	 */
	public int getpS() {
		return this.pS;
	}
	/**
	 * @param pS the pS to set
	 */
	public void setpS(int pS) {
		this.pS = pS;
	}
	/**
	 * @return the kennzeichen
	 */
	public String getKennzeichen() {
		return this.kennzeichen;
	}
	/**
	 * @param kennzeichen the kennzeichen to set
	 */
	public void setKennzeichen(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}
	/**
	 * @return the baujahr
	 */
	public int getBaujahr() {
		return this.baujahr;
	}
	/**
	 * @param baujahr the baujahr to set
	 */
	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "marke=" + marke + " pS=" + pS + " kennzeichen=" + kennzeichen + " baujahr=" + baujahr;
	}
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Auto a1) {
		if(this.pS > a1.pS)return 1;
		if(this.pS < a1.pS)return -1;
		if(this.pS == a1.pS){
			if(this.baujahr > a1.baujahr)return 1;
			if(this.baujahr < a1.baujahr)return -1;
		}
		return 0;
	}
}
