package java1;

import java.util.Scanner;

public class brief1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Bonjour ");
	    System.out.println("Quel est votre prénom ?");
	    String prenom = reader.nextLine();
	    System.out.println("Quel est votre nom ?");
	    String nom = reader.nextLine();
	    System.out.println("Bonjour, "+prenom+" "+nom);
	    System.out.println("Quel est le nombre d'heures travaillés ?");
	    int heures = reader.nextInt();
	    
	  //Calculer l'idemnisation si le nombre d'heures <= 60 heures
	    if (heures <=60) { 
	    	System.out.println("Quel est le tarif ?");
		    double tarif = reader.nextDouble();
		    
		 // si le nombre d'heures <= 40 heures le tarif reste le même
		   if(heures<= 40) { 
			   System.out.println("Votre indemnisation est de "+(tarif*heures)+"Dhs");
		   }
		   
		// on double le tarif pour les heures qui dépassent 40
		   else {  
			  double tt=tarif*40 +(tarif+ 0.5*tarif)*(heures-40);
			  System.out.println("Votre indemnisation est de "+tt+"Dhs");
		   }
		    
	    }
	    else if (heures >= 70) {
	    	System.out.println("informations erronées !");
	    }
	    reader.close();
	}

}
