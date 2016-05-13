import java.util.Scanner;
public class Stones266A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String num = s.nextLine();
		String st = s.nextLine();
		int count=0;
		for (int i=1; i<st.length(); i++) {
			if (st.charAt(i) == st.charAt(i-1)) count++;
		}
		System.out.println(count);
	}
}
