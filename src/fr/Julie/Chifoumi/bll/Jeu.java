package fr.Julie.Chifoumi.bll;

import java.util.Random;

public class Jeu {
	
	public static int getRandom ()
	{
		   Random random = new Random();
		   int retour = 1+random.nextInt(3-1);
		return retour;
	}
	
	public static String ChoixIntToString(int choixInt)
	{
		String choixServer = "";
		
		switch (choixInt) {
		case 1:
			choixServer = "PIERRE";
			break;
			
		case 2:
			choixServer = "FEUILLE";
			break;
			
		case 3:
			choixServer = "CISEAUX";
			break;

		default:
			choixServer = "erreur getChoixServer";		//FIXME : faire une exception
			break;
		}
		
		return choixServer;
	}
	
	
	public static int comparaison (String choixJoueur, String choixServer)
	{
		int resultat = 2;
		// -1 =  perdu, 0 = égalité, 1 = gagné
		
		if(choixJoueur.equals(choixServer))	
			resultat = 0;
		
		if (choixJoueur.equals("CISEAUX") && choixServer.equals("PIERRE"))
			resultat = -1;
		
		if (choixJoueur.equals("PIERRE") && choixServer.equals("FEUILLE"))
			resultat = -1;
		
		if (choixJoueur.equals("FEUILLE") && choixServer.equals("CISEAUX"))
			resultat = -1;
		
		if (choixJoueur.equals("FEUILLE") && choixServer.equals("PIERRE"))
			resultat = 1;
		
		if (choixJoueur.equals("CISEAUX") && choixServer.equals("FEUILLE"))
			resultat = 1;
		
		if (choixJoueur.equals("PIERRE") && choixServer.equals("CISEAUX"))
			resultat = 1;
		
		return resultat;
	}

	public static String resulats (String choixJoueur, String choixServer)
	{
		String message = "";
		
		int resultat = comparaison(choixJoueur, choixServer);
		
		switch (resultat) {
		case -1:
			message = "Perdu !";
			break;
			
		case 0:
			message = "Egalité !";
			break;
		
		case 1:
			message = "Gagné !";
			break;

		default:
			message = "erreur resultat";		//FIXME : faire une exception
			break;
		}
		
		return message;
		
	}
	
	
	
	
}
