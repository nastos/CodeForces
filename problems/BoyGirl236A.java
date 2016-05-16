import java.util.HashSet;
import java.util.Scanner;

public class BoyGirl236A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashSet<Character> hs = new HashSet<Character>();
		String st = s.nextLine();
		for (int i=0; i<st.length(); i++) hs.add(st.charAt(i));
		if (hs.size() % 2 == 0) {
			System.out.println("CHAT WITH HER!");
		}
		else {
			System.out.println("IGNORE HIM!");
		}
	}
}
