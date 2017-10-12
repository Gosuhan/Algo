package co.simplon.algo.serie1;

public class Factoriel2 {

	public static void main(String[] args) {
		System.out.println(factoriel(5));
	}
	
	public static int factoriel(int n) {
		if (n == 1) {
			return 1;
		}
		
		return factoriel(n - 1) * n;
		
	}
}
