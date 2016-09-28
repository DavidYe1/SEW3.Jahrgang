package sunaric;

public class Schueler {
	private String name;
	private int alter;
	/**
	 * Konstruktor - initialisiert nicht namen und alter
	 */
	public Schueler(){
		this.name = null;
		this.alter = 0;
	}
	/**
	 * Konstruktor
	 * @param name , der Name des Schuelers
	 * @param alter , alter des Schuelers
	 */
	public Schueler(String name , int alter){
		this.name = name;
		this.alter = alter;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "name=" + name + " alter=" + alter ;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the alter
	 */
	public int getAlter() {
		return alter;
	}
	/**
	 * @param alter the alter to set
	 */
	public void setAlter(int alter) {
		this.alter = alter;
	}
	/**
	 * true --> gleiche names | false --> unterschiedliche namen
	 * @param s
	 * @return
	 */
	public boolean equals(Object s){
		Schueler s1 = (Schueler)s;
		return this.name.equals(s1.name);
	}
	
}
