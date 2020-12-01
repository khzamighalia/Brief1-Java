/**
 * 
 */
package java1;
import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class ex2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
	    System.out.println("Quel est le prix HT de l'article ?");
	    Double HT = reader.nextDouble();
	    System.out.println("Quel est le nombre d'articles ?");
	    int nb_articles = reader.nextInt();
	    System.out.println("Quel est le taux de TVA ?");
	    Double TVA = reader.nextDouble();
	    Double TTC =  nb_articles*HT*(1+TVA);
	    System.out.println("Le prix TTC est  "+TTC+" Dhs");
	    reader.close();
	}

}
