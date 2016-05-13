import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMath339A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] st = s.nextLine().split("\\+");
		Arrays.sort(st);
		System.out.print(st[0]);
		for (int i =1; i<st.length; i++) {
			System.out.print("+"+st[i]);
		}
	}
}
