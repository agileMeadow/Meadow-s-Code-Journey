package p_2022_07_12;

import java.util.Scanner;

public class TempCoverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t, c;
		String f;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Farenheight.");
		f = sc.nextLine();
		int f1 = Integer.parseInt(f);

		while (true) {
			try {
				f1 = Integer.parseInt(f);
				// To check if int is inserted or not. 문자를 입력했는지, 숫자를 입력했는지.. 판별
			} catch (NumberFormatException n) {
				System.out.println("Not a number");
				// f -> c 로 변경 (32°F − 32) × 5/9 = 0°C
			}
		}
		c = (f1 * 32 - 32) * 5 / 9;
		System.out.println(c);

	}
}
