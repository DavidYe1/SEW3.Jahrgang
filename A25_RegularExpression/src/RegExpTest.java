import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Soll mit hilfe von regEx kommentare aus java-klassen lesen
 * @author Dragana Sunaric
 * @version 18.04.2016
 */
public class RegExpTest {
	private static ArrayList<String> str; //speichert den Inhalt der files
	/**
	 *  geht durch das dir und führt für jedes "normale" file (kein dir) 
	 *  die Methode getFileContent aus
	 */
	private static void goThroughFile(String dirPath){
		str = new ArrayList<String>();
		File f = new File(dirPath);
		File[] fl = f.listFiles();
		for(int i = 0 ; i < fl.length && !fl[i].isDirectory() ; i++){
			str.add(getFileContent(fl[i]));
		}
	}
	/**
	 *	Liest den inhalt des files in die arraylist ein 
	 */
	private static String getFileContent(File f1){
		String s1 = "";
		try{
			Scanner sc = new Scanner(f1);
			while(sc.hasNextLine()){
				s1 += sc.nextLine()+"\n"; 
			}
		}catch(Exception e){
			System.out.println("file not found");
		}
		return s1;
	}
	
	/**
	 * Filtert nach einzeiligen kommentaren und gibt diese zurück
	 */
	private static String getOneLineComments(String s1){
		String sComments = "";
		Pattern p = Pattern.compile("//.*");
		Matcher m = p.matcher(s1);
		while(m.find()){
			sComments += m.group() + "\n";
		}
		return sComments;
	}
	
	/**
	 * Filtert nach Mehrzeiligen kommentaren und gibt diese zurück
	 */
	private static String getComments(String s1){
		String sComments = "";
		Pattern p = Pattern.compile("\t*/\\*.*\n(\t* \\* .*\n)*.*");
		Matcher m = p.matcher(s1);
		while(m.find()){
			sComments += m.group() + "\n";
		}
		return sComments;
	}
	
	/**
	 * führt die methoden getComments und getOneLineComments aus , speichert 
	 * deren rückgabewert und gibt alles zusammen zurück
	 */
	public static String getAllComments(String dir){
		goThroughFile(dir);
		String s1 = "";
		for(int i = 0 ; i < str.size(); i++){
			s1 += getOneLineComments(str.get(i));
			s1 += getComments(str.get(i));
		}
		return s1; 
	}
	/**
	 * Testet meine implementierung
	 * @param args
	 */
	public static void main(String[]args){
		System.out.println(getAllComments("C:\\Users\\Draggy\\Desktop\\Schule\\3XHIT_2015&2016\\SEW_3XHIT_2015&2016\\A23_Rekursion\\src"));
	}
	
}
