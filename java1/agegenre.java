/**
 * 
 */
package java1;

import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class agegenre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
	    System.out.println("Quel est votre genre ? 1: Femme 2: Homme");
	    int genre = reader.nextInt();
	    System.out.println("Quel est votre âge ?");
	    int age = reader.nextInt();
	    affiche(genre,age);
	    reader.close();
	}
	public static void affiche(int genre,int age) {
		
		
			if(age<18 && genre ==1)
				 System.out.print("Vous êtes mineur et une femme ");
			else if(age>=18 && genre ==1)
					System.out.print("Vous êtes majeur et une femme ");
			else if(age>=18 && genre ==2)
				System.out.print("Vous êtes majeur et une homme");
			else {
					System.out.print("Vous êtes mineur et un homme ");
			}
				
			
		
			
		}
		
	}


