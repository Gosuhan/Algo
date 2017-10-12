package co.simplon.algo.serie1;

import java.util.Scanner;

public class Fibonachi {

	public static void main(String[] args) {
			//int n = 6;
			System.out.println("Entrez un entier : ");
			Scanner sc = new Scanner (System.in);
			int n = sc.nextInt();
			System.out.println(fibo(n));
			sc.close();
	}

	public static int fibo(int n) {
		
		if (n == 0) {
			return 0;
		}
		else if (n == 1 || n == 2) {
			return 1;
		}
		else {
			return fibo(n - 2) + fibo(n - 1);
		}
		
	}
	
}
