package co.simplon.algo.serie1;

public class TestEval6 {

	public static void main(String[] args) {
		String Confucius = "Choisissez un travail que vous aimez et vous n'aurez pas à travailler un seul jour de votre vie";
		System.out.println(remplaceVoyelle(Confucius));
	}
	
	public static String remplaceVoyelle(String c) {
		
		//c = 'a';
		if(c == "a" || c == "e" || c == "i" || c == "o" || c == "u" || c == "y") {
			c = "*";
		}
		
		return c;
	}
}
