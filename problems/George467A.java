import java.util.Scanner;

public class George467A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int total=0;
		for (int i=0; i<n; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			if (b-a > 1) total ++;
		}
		System.out.println(total);
	}
}
