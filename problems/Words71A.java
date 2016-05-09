import java.util.Scanner;

public class Words71A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); s.nextLine();
		for (int i=0; i<n; i++) {
			String st = s.nextLine();
			int l = st.length()-2;
			if (l>8) System.out.println(""+st.charAt(0)+l+st.charAt(l+1));
			else System.out.println(st);
		}
	}

}
