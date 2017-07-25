package tr.org.linux.kamp.randomcard;

import java.util.Random;
//RandomCard
public class RandomCard {

	private static Random rgen = new Random();

	public static void main(String[] args) {
		System.out.println(chooseRandomCard());

	}

	private static String chooseRandomCard() {
		return chooseRandomRank() + " of " + chooseRandomSuit();

	}

	private static String chooseRandomRank() {
		int randomNumber = rgen.nextInt(13)+1;
		switch (randomNumber) {
		case 1:
			return "As";
		case 2:
			
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			return " " + randomNumber;
		case 11:
			return "Vale";
		case 12:
			return "Kız";
		case 13:
			return "Papaz";

		default:
			return "hata";

		}

	}

	private static String chooseRandomSuit() {
		int randomNumber = rgen.nextInt(4);
		String karo = "Karo";
		String maca = "Maca";
		String sinek = "Sinek";
		String kupa = "Kupa";

		switch (randomNumber) {
		case 0:
			return maca;
		case 1:
			return kupa;
		case 2:
			return karo;
		case 3:
			return sinek;
		default:
			return "hata";

		}

	}

}
