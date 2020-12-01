/**
 * 
 */
package java1;
import java.util.Scanner;
/**
 * @author Admin
 *
 */
public class afficherrr {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
	    System.out.println("Quel est votre prénom ?");
	    String prenom = reader.nextLine();
	    System.out.println("Quel est votre nom ?");
	    String nom = reader.nextLine();
	    System.out.println("Quel est votre âge ?");
	    int age = reader.nextInt();
	    affiche(prenom,nom,age);
	    reader.close();
	
}
	public static void affiche(String prenom, String nom,int age) {
		 System.out.print(" Bonjour "+prenom+" "+nom+" tu as "+age+" ans ");
	}
}

	