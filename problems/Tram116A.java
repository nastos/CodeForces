import java.util.Scanner;

public class Tram116A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int max=0;
		int curr=0;
		for (int i=0; i<n; i++) {
			curr -= s.nextInt();
			curr += s.nextInt();
			if (curr > max) max = curr;
		}
		System.out.println(max);
	}
}
