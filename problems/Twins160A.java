import java.util.Arrays;
import java.util.Scanner;

public class Twins160A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		int tot=0;
		for (int i=0; i<n; i++) {
			a[i]=s.nextInt();
			tot+=a[i];
		}
		Arrays.sort(a);
		int subtot = 0;
		for (int i=n-1; i>=0; i--) {
			subtot += a[i];
			if (subtot*2 > tot) {
				System.out.println(n-i);
				break;
			}
		}
		
	}

}
