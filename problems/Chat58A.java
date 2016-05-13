import java.util.Scanner;

public class Chat58A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		int i=0;
		while(i<st.length() && st.charAt(i) != 'h') i++;
		//System.out.println("Found it at " + i);
		i++;
		while(i<st.length() && st.charAt(i) != 'e') i++;
		//System.out.println("Found it at " + i);
		i++;
		while(i<st.length() && st.charAt(i) != 'l') i++;
		//System.out.println("Found it at " + i);
		i++;
		while(i<st.length() && st.charAt(i) != 'l') i++;
		//System.out.println("Found it at " + i);
		i++;
		while(i<st.length() && st.charAt(i) != 'o') i++;
		//System.out.println("Found it at " + i);
		if (i>=st.length()) System.out.println("NO");
		else System.out.println("YES");
	}

}
