/**
 * Testklasse 2
 * @author Dragana Sunaric
 * @version 2015/09/25
 */
public class test2 {
	/**
	 * Main Methode
	 * @param args
	 */
	public static void main(String args[]){
		ObjektSpeicher<Integer> os = new ObjektSpeicher(10);
		int i0 = 1;
		int i1 = 1;
		int i2 = 2;
		int i3 = 3;
		int i4 = 5;
		int i5 = 8;
		int i6 = 11;
		os.add(i0, 0);
		os.add(i1, 1);
		os.add(i2, 2);
		os.add(i3, 3);
		os.add(i4, 4);
		os.add(i5, 5);
		os.add(i6, 6);
		for(int i = 0 ; i < os.size() ; i++){
			System.out.println(os.get(i));
		}
	}
}
