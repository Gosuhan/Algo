package co.simplon.algo.serie1;

public class Exercice4 {

	public static void main(String[] args) {
		//  test If
		//  if (condition){
		// 		code si condition vrai
		// }
		// else{
		// 		code si condition fausse
		// }
		long debutProgramme = System.currentTimeMillis();
		System.out.println(System.currentTimeMillis());
		
		int i = 12;
		String temps = "beau";
			// beau, pluvieux, neigeux
		if(temps.equals("beau")) //ou "equalsIgnoreCase" pour ignorer la casse
			System.out.println("Prendre un chapeau");

		System.out.println("delta : " + (System.currentTimeMillis() - debutProgramme));
	}

}
// currentTimeMillis() = Depuis 1er janvier 1970

// Test For
// A voir / instruction "break;" = Arreter dans la boucle For si un élément est déjà trouvé (recherche un élé-
// ment dans un tableau)
// A voir/ instruction "continue;" = Reprendre la ligne de départ sans lire la suite
// exemple For / for(int i=0; i>tabDeValeur.lenght; i++);