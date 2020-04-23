package lab6;

import java.util.Scanner;

public class LabSix {

	public static void main(String[] args) {
		System.out.println("Welcome to Grand Circus Casino!");
		
		Scanner scnr  = new Scanner(System.in);
		System.out.print("How many sides should each die have? ");
		int dieSides = scnr.nextInt();
		String goAgain;
		int count = 1;
		int diceA;
		int diceB;
		
		System.out.println();
		
		System.out.println("Roll 1:");
		
		do {
			diceA = generateRandomDieRoll(dieSides);
			diceB = generateRandomDieRoll(dieSides);
			
			System.out.println(diceA);
			System.out.println(diceB);
			
			diceType(diceA,diceB);
			
			// goAgain();
			// rollCounter(goAgain());
			
			System.out.println("Would you like to roll again (y/n)?");
			goAgain = scnr.next().toLowerCase();
				if (goAgain.startsWith("y")) {
					count++;
					System.out.println();
					System.out.println("Roll " + count + ": ");
				}
			
		}while(goAgain.startsWith("y"));
		
		scnr.close();
		System.out.println("Goodbye, come play again soon!");
	}
	
	private static int generateRandomDieRoll(int n){
		int randNum = 1 +(int)((Math.random())*n);
		return randNum;
	}
	private static void diceType(int a, int b){
		if (a == 1 && b == 1) {
			System.out.println("You rolled snakeeyes!");
		}else if ((a + b) == 3 ) {
			System.out.println("You rolled craps! :(");
		}else if (a == 6 && b ==6) {
			System.out.println("You rolled boxcars!");
		}else {
			return;
		}
	}
	
	// I was having trouble breaking the last part into methods :(
	
	private static boolean goAgain() {
		String goAgain;
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Would you like to roll again (y/n)?");
		goAgain = scnr.next().toLowerCase();
		return goAgain.startsWith("y");
	}
	
	private static void rollCounter(boolean x) {
		if (x) {
			int count = 1;
			count++;
			System.out.println();
			System.out.println("Roll " + count + ": ");
		}
	}
}
