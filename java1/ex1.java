/**
 * 
 */
package java1;
import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class ex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
	    System.out.println("Quel est votre prénom ?");
	    String prenom = reader.nextLine();
	    System.out.println("Bonjour, "+prenom);
	    reader.close();


	}

}
