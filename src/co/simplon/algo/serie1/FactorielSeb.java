package co.simplon.algo.serie1;

public class FactorielSeb {

	public static void main(String[] args) {
		// Valeur pour laquel on cherche le factoriel
		int valeur = 5;
		
		// Résolution avec une boucle
		System.out.println("Résolution avec une boucle");
		int resultat = 1;
		for(int i=1 ; i<=valeur ; i++){
			resultat = resultat * i; // peut aussi s'ecrire comme ça resultat *= i;
		}

		// Affichage du résultat
		System.out.println("resultat : " + resultat);
		
		// Résolution grâce à une fonction récursive
		System.out.println("\n\nRésolution avec une fonction récursive");
		System.out.println("resultat : " + factoriel(valeur));
	}

	public static int factoriel(int nombre) {
		// A décocher pour un affichage
		//System.out.println("Appel de la fonction factoriel avec " + nombre);
		
		// Condition de sortie : si nombre = 1 => factoriel = 1
		if(nombre == 1)
			return 1;

		// Calcul général : factoriel(nombre) = nombre * factoriel(nombre -1)
		return nombre * factoriel(nombre - 1);
	}
	
}