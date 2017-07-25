package tr.org.linux.kamp.hipo;

import java.util.Scanner;

public class hipotenus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a: ");
		int a = sc.nextInt();

		System.out.println("b: ");
		int b = sc.nextInt();

		System.out.println("Ucgenin hipotenusu= " + getHipotenus(a, b));
		System.out.println("Ucgenin alanı= " + getArea(a, b));
		System.out.println("Ucgenin cevresi= " + getPerimeter(a, b));
	}

	public static int getHipotenus(int a, int b) {
		return (int) Math.hypot(a, b);
	}

	public static int getArea(int a, int b) {
		return (a * b) / 2;
	}

	public static  int getPerimeter(int a, int b) {
		return getHipotenus(a, b) + a + b;
	}
}