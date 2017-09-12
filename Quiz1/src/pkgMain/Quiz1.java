package pkgMain;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter the total touchdowns: ");
		int TD = input.nextInt();
		System.out.print("enter the total yards: ");
		int YDS = input.nextInt();
		System.out.print("enter the total interceptions: ");
		int INT = input.nextInt();
		System.out.print("enter the total completions: ");
		int COMP = input.nextInt();
		System.out.print("enter the total attempted passes: ");
		int ATT = input.nextInt();
		double a = (((COMP / ATT) - .3) * 5);
		double b = (((YDS / ATT) - 3) * .25);
		double c = ((TD / ATT) * 20);
		double d = (2.375 - ((INT / ATT) * 25));
		if (a > 2.375) {
			a = 2.375;
		} else if (a < 0) {
			a = 0;
		} else {
			a = a;
		}
		if (b > 2.375) {
			b = 2.375;
		} else if (b < 0) {
			b = 0;
		} else {
			b = b;
		}
		if (c > 2.375) {
			c = 2.375;
		} else if (c < 0) {
			c = 0;
		} else {
			c = c;
		}
		if (d > 2.375) {
			d = 2.375;
		} else if (d < 0) {
			d = 0;
		} else {
			d = d;
		}
		double PR = (((a + b + c + d) / 6) * 100);
		System.out.println("The passer rating is : " + PR);
	}
}
