package practice01;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		Random r = new Random();
		
		int guessNumber = r.nextInt(100) + 1;
		
		System.out.println( guessNumber );
		
		Scanner scanner = new Scanner( System.in );
		scanner.close();
	}
}
