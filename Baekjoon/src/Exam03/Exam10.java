package Exam03;

import java.util.Scanner;

public class Exam10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt(); // ���� N��
		int X = scanner.nextInt(); // Ư�� ����

		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = scanner.nextInt(); // ����
		}
		for (int j = 0; j < N; j++) {
			if (X > A[j]) {
				System.out.print(A[j] + " ");
			}
		}
	}
}
