import java.io.*;
/**
 * gibt Rekursiv die names aller Files in einem Directory aus
 * @author Dragana Sunaric
 * @version 14.03.2016
 */
public class A23_Rekursion_Files {
	public static int speicher = 0;
	public static int subdirs = 0;
	/**
	 * Gibt alle Files in einem Directory aus 
	 * @param dirPath , der Pfad des Directories
	 */
	public static void listDir(String dirPath){
		File f = new File(dirPath);
		File[] fl = f.listFiles();
		for(int i = 0 ; i < fl.length ; i++){
			if(fl[i].isDirectory()){
				listDir(fl[i].getAbsolutePath());
				subdirs++;
			}else{
				System.out.println(fl[i].getName());
				speicher += fl[i].length();
			}
			// ich bin ein Zeielkommentar
			//noch einer
		}
		System.out.println("Größe:\t" + speicher + " Byte");
		System.out.println("Subdirectories:\t" + subdirs);
		speicher = 0;
		subdirs = 0;
	}
	/**
	 * Testet die Methode listDir
	 * @param args
	 */
	public static void main (String[]args){
		listDir("C:\\Users\\Draggy\\Desktop\\Schule\\3XHIT_2015&2016\\Mathe_3CHIT_2015&2016\\Hausübungen");
	}
}
