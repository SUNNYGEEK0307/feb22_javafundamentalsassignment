package week_4assignment;
import java.util.Scanner;
public class divby_2_and_8butnot_12 {
	public class div_by_2_and_8_but_not_12 {
		public static void main(String[] args) {
			int n;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter number: ");
			n = sc.nextInt();
			if (n % 2 == 0 && n % 8 == 0 && n % 12 != 0) {
				System.out.print("True");
			} else {
				System.out.print("False");
			}
		}
	}

}
