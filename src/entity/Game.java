package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

	int a = 0; // ��������� �������� ��������� - "��"
	int b = 9; // �������� �������� ��������� - "��"

	private static final Scanner sc = new Scanner(System.in);

	public void game() {
		PlayFree play = new PlayFree();
		System.out.println("     Welcome to MEGA LOT!!!");
		System.out.println("Enter yout Name");
		String name = sc.next();
		;
		play.setName(name);
		System.out.println("Enter your RATE(������)");
		int rate = sc.nextInt();
		play.setRate(rate);

		System.out.println();
		System.out.println();
		System.out.println("Let`s Play " + name);
		System.out.println("���� ������ " + rate + "  $");
		System.out.println("�������:");
		System.out.println("��� ������� ������� ����� �� 0 �� 9");
		System.out
				.println("�������� ���� ����������� ��� � ����� ��� ��� ������� ��������");
		System.out
				.println("���� ������� � ����� ������ ������ ���������  �� 1.5");
		System.out.println("���� � 2 �� 1,2");
		System.out.println("���� � 3 �� 0,5");
		System.out.println("���� �� �� ������� � 3 ����� ��� ���������!!");
		System.out.println("-----GAME------");

		while (true) {
			int x = a + (int) (Math.random() * b);
			System.out.println("������ �����");
			int n = sc.nextInt();
			if (n >= 0 && n <= 9) {
				if (x >= 5 && x <= 9) {
					if (n == x) {
						System.out.println("WIN");
						int win = (int) (rate * 1.5);
						System.out.println("��� ������: " + win + " $ ");
						break;

					} else
						System.out.println("������ ���� ����� ����� 5");
					//System.out.println(x);
					n = sc.nextInt();
					if (n >= 5 && n <= 9) {
						if (n == x) {
							System.out.println("Win");
							System.out.println(x);
							int win = (int) (rate * 1.2);
							System.out.println("��� ������: " + win + " $ ");
							break;
						} else
							System.out.println("������ ���� ����� ���� 5");
						//System.out.println(x);
						n = sc.nextInt();
						if (n >= 5 && n <= 9) {
							if (n == x) {
								System.out.println("Win");
								int win = (int) (rate * 0.5);
								System.out.println("��� ������: " + win
										+ " $ ");
								break;
							} else
								System.out.println("You LOSE");
							System.out.println("�������� �����: " + x);
							break;
						}
					}

				} else if (x >= 0 && x <= 5) {
					if (n >= 0 && n <= 5) {
						if (n == x) {
							System.out.println("Win");
							int win = (int) (rate * 1.5);
							System.out.println("��� ������: " + win + " $ ");
							break;
						} else
							System.out.println("������ ���� ����� ����� 5");
						//System.out.println(x);
						n = sc.nextInt();
						if (n >= 0 && n <= 5) {
							if (n == x) {
								System.out.println("Win");
								int win = (int) (rate * 1.2);
								System.out.println("��� ������: " + win
										+ " $ ");
								break;
							} else
								System.out
										.println("������ ���� ����� ����� ����� 5");
							//System.out.println(x);
							n = sc.nextInt();
							if (n >= 0 && n <= 5) {
								if (n == x) {
									System.out.println("Win");
									int win = (int) (rate * 0.5);
									System.out.println("��� ������: " + win
											+ " $ ");
									break;
								} else
									System.out.println("You LOSE");
								System.out.println("�������� �����: " + x);
								break;
							}
						}
					}
				} else if (n<0 | n>9)
					System.out.println("������ ����� � ������� �� 0 �� 9");
			}

		}// END of WHILE

	}
}
