package tr.org.linux.kamp.sphere;

import java.util.Scanner;

public class Sprehe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Yaricap giriniz: ");
		int radius = sc.nextInt();

		System.out.println("Hacim: " + getVolume(radius));

	}

	public static double getVolume(int radius) {
		return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	}

}
