package entity;


import java.util.Scanner;

public class Game {

	int a = 0; // Начальное значение диапазона - "от"
	int b = 9; // Конечное значение диапазона - "до"

	private static final Scanner sc = new Scanner(System.in);

	public void game() {
		PlayFree play = new PlayFree();
		System.out.println("     Welcome to MEGA LOT!!!");
		System.out.println("Enter yout Name");
		String name = sc.next();
		;
		play.setName(name);
		System.out.println("Enter your RATE(Ставка)");
		int rate = sc.nextInt();
		play.setRate(rate);

		System.out.println();
		System.out.println();
		System.out.println("Let`s Play " + name);
		System.out.println("Your bet " + rate + "  $");
		System.out.println("Rules:");
		System.out.println("You need to guess the number from 0 to 9");
		System.out
				.println("The computer will show you in which movement you need to move");
		System.out
				.println("Guessing from the first attempt, the rate is multiplied by 1.5");
		System.out.println("Guessing from the Second on 1,2");
		System.out.println("If from third to 0,5");
		System.out.println("If you do not guess from 3 attempts, the game is over!!");
		System.out.println("-----GAME------");

		while (true) {
			int x = a + (int) (Math.random() * b);
			System.out.println("Enter number");
			int n = sc.nextInt();
			if (n >= 0 && n <= 9) {
				if (x >= 5 && x <= 9) {
					if (n == x) {
						System.out.println("WIN");
						int win = (int) (rate * 1.5);
						System.out.println("Your winnings: " + win + " $ ");
						break;

					} else
						System.out.println("Enter a new number more 5");
					//System.out.println(x);
					n = sc.nextInt();
					if (n >= 5 && n <= 9) {
						if (n == x) {
							System.out.println("Win");
							System.out.println(x);
							int win = (int) (rate * 1.2);
							System.out.println("Your winnings: " + win + " $ ");
							break;
						} else
							System.out.println("Enter a new number more 5");
						//System.out.println(x);
						n = sc.nextInt();
						if (n >= 5 && n <= 9) {
							if (n == x) {
								System.out.println("Win");
								int win = (int) (rate * 0.5);
								System.out.println("Your winnings: " + win
										+ " $ ");
								break;
							} else
								System.out.println("You LOSE");
							System.out.println("Number: " + x);
							break;
						}
					}

				} else if (x >= 0 && x <= 5) {
					if (n >= 0 && n <= 5) {
						if (n == x) {
							System.out.println("Win");
							int win = (int) (rate * 1.5);
							System.out.println("Your winnings: " + win + " $ ");
							break;
						} else
							System.out.println("Enter a new number more 5");
						//System.out.println(x);
						n = sc.nextInt();
						if (n >= 0 && n <= 5) {
							if (n == x) {
								System.out.println("Win");
								int win = (int) (rate * 1.2);
								System.out.println("Your winnings: " + win
										+ " $ ");
								break;
							} else
								System.out
									.println("Enter a new number more 5");
							//System.out.println(x);
							n = sc.nextInt();
							if (n >= 0 && n <= 5) {
								if (n == x) {
									System.out.println("Win");
									int win = (int) (rate * 0.5);
									System.out.println("Your winnings: " + win
											+ " $ ");
									break;
								} else
									System.out.println("You LOSE");
								System.out.println("Number: " + x);
								break;
							}
						}
					}
				} else if (n<0 | n>9)
					System.out.println("Enter a number in the range from 0 to 9");
			}

		}// END of WHILE

	}
}
