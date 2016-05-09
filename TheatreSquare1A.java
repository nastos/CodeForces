import java.util.Scanner;

public class TheatreSquare1A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long m = s.nextLong();
		long a = s.nextLong();
		System.out.println((long) (Math.ceil((n+0.0)/a) * Math.ceil((m+0.0)/a)));

		
	}

}
