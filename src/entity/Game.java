package entity;

import java.util.ArrayList;
import java.util.List;
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
		System.out.println("Ваша Ставка " + rate + "  $");
		System.out.println("Правила:");
		System.out.println("Вам потрібно вгадати число від 0 до 9");
		System.out
				.println("Компютер буде підсказувати вам в якому русі вам потрібно рухатись");
		System.out
				.println("Якщо вгадуєте з першої спроби ставка множиться  на 1.5");
		System.out.println("Якщо з 2 на 1,2");
		System.out.println("Якщо з 3 на 0,5");
		System.out.println("Якщо ви не вгадуєте з 3 спроб гру завершено!!");
		System.out.println("-----GAME------");

		while (true) {
			int x = a + (int) (Math.random() * b);
			System.out.println("Введіть число");
			int n = sc.nextInt();
			if (n >= 0 && n <= 9) {
				if (x >= 5 && x <= 9) {
					if (n == x) {
						System.out.println("WIN");
						int win = (int) (rate * 1.5);
						System.out.println("Твій виграш: " + win + " $ ");
						break;

					} else
						System.out.println("Введіть нове число більше 5");
					//System.out.println(x);
					n = sc.nextInt();
					if (n >= 5 && n <= 9) {
						if (n == x) {
							System.out.println("Win");
							System.out.println(x);
							int win = (int) (rate * 1.2);
							System.out.println("Твій виграш: " + win + " $ ");
							break;
						} else
							System.out.println("Введіть нове число білье 5");
						//System.out.println(x);
						n = sc.nextInt();
						if (n >= 5 && n <= 9) {
							if (n == x) {
								System.out.println("Win");
								int win = (int) (rate * 0.5);
								System.out.println("Твій виграш: " + win
										+ " $ ");
								break;
							} else
								System.out.println("You LOSE");
							System.out.println("Загадене число: " + x);
							break;
						}
					}

				} else if (x >= 0 && x <= 5) {
					if (n >= 0 && n <= 5) {
						if (n == x) {
							System.out.println("Win");
							int win = (int) (rate * 1.5);
							System.out.println("Твій виграш: " + win + " $ ");
							break;
						} else
							System.out.println("Введіть нове число менше 5");
						//System.out.println(x);
						n = sc.nextInt();
						if (n >= 0 && n <= 5) {
							if (n == x) {
								System.out.println("Win");
								int win = (int) (rate * 1.2);
								System.out.println("Твій виграш: " + win
										+ " $ ");
								break;
							} else
								System.out
										.println("Введіть нове число число менше 5");
							//System.out.println(x);
							n = sc.nextInt();
							if (n >= 0 && n <= 5) {
								if (n == x) {
									System.out.println("Win");
									int win = (int) (rate * 0.5);
									System.out.println("Твій виграш: " + win
											+ " $ ");
									break;
								} else
									System.out.println("You LOSE");
								System.out.println("Загадене число: " + x);
								break;
							}
						}
					}
				} else if (n<0 | n>9)
					System.out.println("Введіть число в діапазоні від 0 до 9");
			}

		}// END of WHILE

	}
}
