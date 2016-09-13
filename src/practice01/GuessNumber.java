package practice01;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			
			int min = 1;
			int max = 100;
			Random random = new Random();
			int correctNumber = random.nextInt(max) + min;
			
			while (true) {
				System.out.print(">>");
				int answerNumber = scanner.nextInt();

				if (answerNumber < correctNumber) {
					System.out.println("더 높게");
					min = answerNumber;
				} else if (answerNumber > correctNumber) {
					System.out.println("더 낮게");
					max = answerNumber;
				} else {
					System.out.println("맞았습니다.");
					break;
				}

				System.out.println(min + "-" + max);
			}

			System.out.print("게임을 종료 하시겠습니까?(y/n) >>");
			String retryAnswer = scanner.next();
			if ("y".equals(retryAnswer)) {
				break;
			}
		}

		scanner.close();
	}
}