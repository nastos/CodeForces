import java.util.Scanner;

public class Team231A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count=0;
		for (int i=0; i<n; i++) {
			int tot = s.nextInt() + s.nextInt() + s.nextInt();
			if (tot >= 2) count ++;
		}
		System.out.println(count);
	}
}
