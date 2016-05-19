import java.util.Scanner;

public class NearlyLucky110A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		int count = 0;
		for (int i=0; i<st.length(); i++) {
			if (st.charAt(i) == '4' || st.charAt(i)=='7') count++;
		}
		if (count == 4 || count == 7) {
			System.out.println("YES");
		}
		else System.out.println("NO");

	}

}
