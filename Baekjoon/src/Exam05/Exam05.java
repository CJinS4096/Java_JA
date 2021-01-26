package Exam05;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int max = -1;
		int sum = 0;
		double average = 0.0; // ���� ���

		int N[] = new int[scanner.nextInt()]; // ���� ����

		for (int i = 0; i < N.length; i++) {
			N[i] = scanner.nextInt();
			sum += N[i];
			if (N[i] > max) {
				max = N[i];
			}
		}
		average = ((double) sum / (max * N.length));
		System.out.println(average);
		scanner.close();
	}
}
