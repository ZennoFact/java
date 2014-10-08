import java.util.Scanner;

public class diamond {
	/**
	 * ユーザーはひし形の対角線の長さを入力する
	 * 入力した長さの半分の位置（center）から，
	 * 出力するべきひし形が何文字分ずれているか（dif）で
	 * ひし形を表示する位置を制御 例）一行目のdifは0。2行目のdifは1。
	 *
	 * @param diagonal int:対角線の長さ
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("ひし形の対角線の長さを正の整数で入力してください > ");
			int diagonal = sc.nextInt();
			if (diagonal == 0) break;
			int center = diagonal / 2;
			int dif = 0;

			for (int row = 0; row < diagonal; row++) {
				for (int col = 0; col < diagonal; col++) {
					if (col == center - dif || col == center + dif) {
						System.out.print("◇");
					} else {
						System.out.print("　");
					}
				}
				if (row < center) {
					dif++;
				} else {
					dif--;
				}
				System.out.println();
			}
		}
		sc.close();
		System.out.println("プログラムを終了します");
	}
}
