import java.util.Scanner;
public class HQ133A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		if (st.contains("H") || st.contains("Q") || st.contains("9")) System.out.println("YES");
		else System.out.println("NO");
	}
}
