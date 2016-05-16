import java.util.Scanner;

public class NumberChallenge236B {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int MAX = 1000001; // 100*100*100
		int[] d = new int[MAX];
		for (int i=1; i<MAX; i++) {
			for (int j=i; j<MAX; j+=i) {
				d[j]++; // builds divisor function
			}
		}
		long sum=0;
		for (int i=1; i<=a; i++) {
			for (int j=1; j<=b; j++) {
				for (int k=1; k<=c; k++) {
					sum = (sum + d[i*j*k])%1073741824;
				}
			}
		}
		System.out.println(sum);
	}
}
