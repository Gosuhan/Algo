/**
 * 
 */
package co.simplon.algo.serie1;


public class Exercice2 {

	public static void main(String[] args) {
		int i = 12;
		System.out.println(commenterLaNote(i));
		System.out.println(commenterLaNote(-5));
		System.out.println(commenterLaNote(0));
		System.out.println(commenterLaNote(3));
		System.out.println(commenterLaNote(8));
		System.out.println(commenterLaNote(11));
		System.out.println(commenterLaNote(13));
		System.out.println(commenterLaNote(16));
		System.out.println(commenterLaNote(20));
	}

	public static String commenterLaNote(int n) {
		
		String appreciation = "";
	
		if (n > 20 || n < 0) {
			appreciation = "erreur";
		}
		else if (n < 5) {
			appreciation = "null";
		}
		else if (n < 10) {
			appreciation = "a refaire";
		}
		else if (n < 13) {
			appreciation = "passable";
		}
		else if (n < 15) {
			appreciation = "bien";
		}
		else {
			appreciation = "tres bien";
		}
		
		return appreciation;
	}
}		
