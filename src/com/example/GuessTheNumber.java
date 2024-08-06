package com.example;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Random random = new Random();
		Scanner s = new Scanner(System.in);
		
		final int mchances = 10;
		final int takeBreak = 1 * 60 * 1000;
		boolean playAgain = true;

		while (playAgain) {
			int guess = -1;
			int chances = 0;
			int num = random.nextInt(100) + 1;
			
			while (guess != chances && chances < mchances) {
				System.out.println("Enter the number between 1 to 100: ");
				guess = s.nextInt();

				if (guess == num) {
					System.out.println("Congratulations! You have entered correct number.");
					System.out.println("Your score is " + (mchances - chances));
					break;
				} else if (guess > num) {
					System.out.println("OOPS Try again! Your guess is greater than number");
				} else {
					System.out.println("OOPS Try again! Your guess is smaller than number");
				}
				chances++;
			}

			if (guess != num) {
				System.out.println("You have missed 10 attempts. \n Try after 5 mins ");
				Thread.sleep(takeBreak);
			}
			System.out.println("Do you want to play again ? (y/n)");
			String chance1 = s.next();
			
			if (chance1.equalsIgnoreCase("y")) {
				System.out.println("Here we go again! ");
			} else {
				playAgain = false;
				System.out.println("Thank you for playing!");
			}

		}

	}
}
