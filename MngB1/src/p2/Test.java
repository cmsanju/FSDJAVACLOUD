package p2;

import java.util.Scanner;

public class Test {

	public static void main(String args[]) {
		Test p = new Test();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for check in main method:");
		int n = scan.nextInt();
		int count = 0;
		int number = 0;
		for (int i = 2; i <= 9; i++) {
		if (n % i == 0) {
		System.out.println(" count called when " + i);
		count = count + 1;
		}
		number = number + 1;
		System.out.println(" The loop called "+number+" times");
		}
		if (count == 0) {
		System.out.println(n + " is a prime number ");
		}
		System.out.println(" ================================ ");
		//p.checkPrime();
		}

}
