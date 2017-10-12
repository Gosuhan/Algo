package co.simplon.algo.serie1;

public class Eval3 {

	public static void main(String[] args) {
		
		int i = (int)(Math.random() * 50);
		//(int)x = transformer x en entier
		// ou double i = Math.random()*50;
		System.out.println(i);
		System.out.println(supInf(i));
		//int n = 10;
	}

	public static String supInf(int n){ //ou double n
		
		//n = 50;
		String result = "";
		
		if(n < 25) {
			result = "L'entier est inférieur à 25";
		}
		else if (n > 25) {
			result = "L'entier est supérieur à 25";
		}
		return result;
	}

}
