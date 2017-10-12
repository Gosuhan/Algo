package co.simplon.algo.serie1;

public class TestEval3 {

	public static void main(String[] args) {
		System.out.println(getRandom(48, 50));

	}
	
	public static int getRandom(int min, int max) {
		
		return (int)(Math.random() * (max - min)) + min;
		
	}
	
		
}
