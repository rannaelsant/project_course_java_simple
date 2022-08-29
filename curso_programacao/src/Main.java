package 

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha 3 números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();

	}
}
