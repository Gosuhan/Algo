package co.simplon.algo.serie1;

public class eval6 {

	public static void main(String[] args) {
	
	String Confucius ="Choisissez un travail que vous aimez et vous n'aurez pas à travailler un seul jour de votre vie";
	Confucius = Confucius.replaceAll("[aàeiouy]", "*");
	//ou Confucius = Confucius.replace('a', '*').replace('e', '*').replace('i', '*').replace('o', '*').replace('u', '*').replace('y', '*').replace('à', '*');
	System.out.println(Confucius);
	
	}
	
}