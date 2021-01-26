package Exam05;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		System.out.println("N " + N);
		String str[] = new String[N];
		int score[] = new int[N];

		for (int i = 0; i < N; i++) {
			str[i] = scanner.nextLine();
		}

		for (int j = 0; j < str.length; j++) {
			for (int k = 0; k < str[j].length(); k++) {
				if (str[j].charAt(k) == 'O') {
					score[j] += 1;
				}
			}
			System.out.println(score[j]);
		}
		scanner.close();
	}
}
