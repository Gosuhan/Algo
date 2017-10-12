package co.simplon.algo.serie1;

public class Exercice3 {

	public static void main(String[] args) {
		char a = 'D';
		System.out.println(lettreEnNombre(a));
	}

	public static int lettreEnNombre(char b) {
		
		int nombre = 0;
		
		if (b == 'A') {
			nombre = 20;
		}
		else if (b == 'B') {
			nombre = 15;
		}
		else if (b == 'C') {
			nombre = 10;
		}
		else if (b == 'D') {
			nombre = 5;
		}
		else {
			nombre = 0;
		}
		return nombre;
	}
}
