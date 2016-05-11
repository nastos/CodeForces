import java.util.Scanner;
public class PetyaStrings112A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine().toLowerCase();
		String s2 = s.nextLine().toLowerCase();
		if (s1.compareTo(s2)>0) System.out.println(1);
		if (s1.compareTo(s2)<0) System.out.println(-1);
		if (s1.compareTo(s2)==0) System.out.println(0);
		
	}
}
