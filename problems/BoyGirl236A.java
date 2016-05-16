import java.util.Scanner;

public class BoyGirl236A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		if (s.nextLine().length() % 2 == 0) {
			System.out.println("CHAT WITH HER!");
		}
		else {
			System.out.println("IGNORE HIM!");
		}
	}
}
