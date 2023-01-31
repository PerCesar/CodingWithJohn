package ProgrammingLogicInJava;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Random rand = new Random();
		int randomNumber = rand.nextInt(100)+1;
		
		while(true) {
		System.out.println("Please enter your guess from 1-100: ");
		int playerGuess = input.nextInt();
		
		if(playerGuess == randomNumber) {
			System.out.println("Correct! You win!");
			break;
		}
		else if (randomNumber > playerGuess) {
			System.out.println("Nope! The number is higher!");
		}
		else if (randomNumber < playerGuess) {
			System.out.println("Nope! The number is lower");
		}
		}
	}

}
