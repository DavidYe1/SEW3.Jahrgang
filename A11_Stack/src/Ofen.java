/**
 * Model-Klasse für einen Ofen
 * @author Dragana Sunaric
 * @version 19.11.2015
 */
public class Ofen {
	public BrickettStacks b1;
	public BrickettStacks b2;
	/**
	 * Konstruktor welcher einen Stack mit bricketts füllt
	 */
	public Ofen(){
		this.b1 = new BrickettStacks();
		this.b2 = new BrickettStacks();
		this.b1.push(new Holzbrickett());
		this.b1.push(new Palletsbrickett());
		this.b1.push(new Steinkohlebrickett());
		this.b1.push(new Holzbrickett());
		this.b1.push(new Palletsbrickett());
		this.b1.push(new Palletsbrickett());
		this.b1.push(new Holzbrickett());
		this.b1.push(new Palletsbrickett());
		this.b1.push(new Braunkohlebrickett());
		this.b1.push(new Palletsbrickett());
	}
	/**
	 * Methode um palletbricketts zu heizen 
	 * @return true --> brickets wurden verheizt | false --> wurden nciht verheitzt
	 */
	public boolean palletsHeizen(){
		try{
			if(b1.peek() instanceof Palletsbrickett){
				b1.pop();
				return true;
			}else{
				b2.push(b1.pop());
				return false;
			}
		}catch(Exception e){
			System.out.println("Stack ist leer!!!");
			return false;
		}
	}
	public static void main(String []args){
		Ofen o1 = new Ofen();
		System.out.println(o1.palletsHeizen());
		System.out.println(o1.palletsHeizen());
		System.out.println(o1.palletsHeizen());
		System.out.println(o1.palletsHeizen());
		System.out.println(o1.palletsHeizen());
		System.out.println(o1.palletsHeizen());
		System.out.println(o1.palletsHeizen());
		System.out.println(o1.palletsHeizen());
		System.out.println(o1.palletsHeizen());
		System.out.println(o1.palletsHeizen());
	}
}
