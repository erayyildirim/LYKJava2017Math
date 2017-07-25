package tr.org.linux.kamp.dicegame;

import java.util.Random;
import java.util.Scanner;

//2oyuncu ismi al, zar attır, hangi zar büyükse o kazansın..
public class DiceGame {
	
	private static Random rgen = new Random();
	
	public static void main(String[] args) {
		System.out.println("1. Oyuncu İsim Gir:");
		Scanner sc = new Scanner(System.in);
		String user1 = sc.next();
		System.out.println("2. Oyuncu İsim Gir:");
		String user2 = sc.next();
		
		int dice1 = zarAt();
		int dice2 = zarAt();
		
		System.out.println(user1 + "in zarı = " + dice1);
		System.out.println(user2 + "in zarı = " + dice2);
		String winner ="";
		
//		if(dice1 > dice2){
//			winner = user1;
//		}
//		else if (dice1 == dice2){
//			winner = "berabere";
//			
//		}
//		else{
//			winner = user2;
//		}
		
		winner = (dice1>dice2) ?  user1 : (dice1==dice2) ? "Berabere" : user2;
		System.out.println("kazanan= " + winner);
		
		
		
	}
	
	public static int zarAt(){
		
		return rgen.nextInt(6)+1;
		
	
	}

}
