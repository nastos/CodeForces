import java.util.Scanner;
public class Football96A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		int count =1;
		String output = "NO";
		for (int i=1; i<st.length(); i++) {
			if (st.charAt(i) == st.charAt(i-1)) count++;
			else count=1;
			if (count >= 7) {
				output = "YES";
				break;
			}
		}
		System.out.println(output);
	}
}
