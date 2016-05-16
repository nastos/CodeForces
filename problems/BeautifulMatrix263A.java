import java.util.Scanner;

public class BeautifulMatrix263A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				int a = s.nextInt();
				if (a==1) {
					System.out.println((int)(Math.abs(2-i) + Math.abs(2-j)));
				}
			}
		}
	}
}
