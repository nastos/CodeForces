import java.util.Scanner;

public class Bit282A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); s.nextLine();
		int tot=0;
		for (int i=0; i<n; i++) {
			if (s.nextLine().contains("++")) tot++;
			else tot --;
		}
		System.out.println(tot);
	}
}
