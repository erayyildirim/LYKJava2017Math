package tr.org.linux.kamp.random;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {

		System.out.println("Math random: " + Math.random());

		Random rgen = new Random();
		System.out.println("Rgen random= " + rgen.nextInt());
		System.out.println("Rgen random next double= " + rgen.nextDouble());
		System.out.println("Rgen random next boolean= " + rgen.nextBoolean());

		Random rgen2 = new Random();
		System.out.println("Rgen2 random= " + rgen2.nextInt(100));

	}
}
