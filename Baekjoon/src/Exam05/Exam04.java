package Exam05;

// ���ذ� ��¦ �ȵǴ� ���� �ٽ� Ǯ��� �ڡڡ١١�

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int count = 0; // �ߺ����� �� ����
		int over = 0; // �ߺ��� ����
		int division[] = new int[10];

		for (int i = 0; i < division.length; i++) {
			division[i] = scanner.nextInt() % 42;
		}

		for (int j = 0; j < division.length; j++) {
			over = 0;
			for (int k = j + 1; k < division.length; k++) {
				if (division[j] == division[k]) {
					over++;
				}
			}
			if (over == 0) {
				count++;
			}
		}
		System.out.println(count);
		scanner.close();
	}
}