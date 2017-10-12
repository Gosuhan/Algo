package co.simplon.algo.serie1;

public class FactorielFor {

	public static void main(String[] args) {
		
		int valeur = 5;
		int resultat = 1;
		for (int i = 1; i <= valeur; i++ ) {
			resultat = resultat * i;
		}
		
		System.out.println(resultat);
		
	}
}