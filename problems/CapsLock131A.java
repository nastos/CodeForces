import java.util.Scanner;

public class CapsLock131A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		System.out.println(flipIf(st));
	}

	private static String flipIf(String st) {
		if (st.toUpperCase().compareTo(st)==0) return st.toLowerCase();
		else if (st.substring(1).toUpperCase().compareTo(st.substring(1))==0) {
			StringBuilder sb = new StringBuilder(st);
			char c = st.charAt(0);
			if (Character.isLowerCase(c)) sb.setCharAt(0, Character.toUpperCase(c));
			for (int i=1; i<sb.length(); i++) sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
			return sb.toString();
		}
		else return st;
	}

}
