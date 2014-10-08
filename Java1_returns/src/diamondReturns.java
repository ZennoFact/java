import java.util.Scanner;

public class diamondReturns {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		do {
			int C = number / 2 + 1;
			int test1 = C;
			int test2 = C;

			for (int i = 1; i <= number; i++) {
				if(i < C) {
				for (int j = 1; j <= number; j++) {
					if (j == test1 || j == test2) {
						System.out.print("◇");
					} else {
						System.out.print("　");
					}
				}
				test2--;
				test1++;
				System.out.print("\n");
				}
				else {
					for (int j = 1; j <= number; j++) {
						if (j == test1 || j == test2) {
							System.out.print("◇");
						} else {
							System.out.print("　");
						}


					}
					test1--;
					test2++;
					System.out.print("\n");
				}}
				number = sc.nextInt();


		} while (number > 0);
		System.out.println("プログラムを終了します");
	}
}
