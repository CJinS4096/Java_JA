package Exam05;

// �ð��� �ټ� �ɷȴ� ���� �ٽ� Ǯ��� �ڡ١١١�
import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count[] = new int[9];

		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		String str = String.valueOf(A * B * C);

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == Character.forDigit(i, 10)) {
					count[i]++;
				}
			}
		}
		for (int k = 0; k < count.length; k++) {
			System.out.println(count[k]);
		}
		scanner.close();
	}
}
