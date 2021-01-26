package Exam04;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int tmp = n;
		int count = 0;

		do {
			int A = tmp / 10;
			int B = tmp % 10;
			if ((A + B) >= 10) {
				tmp = ((B * 10) + (A + B - 10));
			} else {
				tmp = ((B * 10) + (A + B));
			}
			count++;
		} while (tmp != n);

		System.out.println(count);
		scanner.close();
	}
}