import java.util.Scanner;

public class Holidays670A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int fullweeks = n/7;
		int rem = n%7;
		int min = 2*fullweeks + (rem==6?1:0);
		int max = 2*fullweeks + Math.min(rem, 2);
		System.out.println(min+" "+max);
	}

}
