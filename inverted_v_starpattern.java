package week_4assignment;
import java.util.Scanner;
public class inverted_v_starpattern {
	public static void main(String[] args) {
	Scanner	sc = new Scanner(System.in);
		
		System.out.print("Enter Inverted V Shape Star Pattern Rows = ");
		int rows = sc.nextInt();
		
		System.out.println("Printing Inverted V Shape Star Pattern");
		
		for (int i = rows; i >= 1; i-- ) 
		{
			for (int j = 1 ; j <= i; j++ ) 
			{
				System.out.print("*");

			}
			for (int k = 1 ; k <= 2 * (rows - i); k++ ) 
			{
				System.out.print(" ");
			}
			for (int l = 1 ; l <= i; l++ ) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


