import java.util.Scanner;

public class NextRound158A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int[] a = new int[100];
		for (int i=0; i<n; i++){
			a[i] = s.nextInt();
		}
		if (a[k-1] > 0) {
			while(k<n && a[k-1] == a[k]) k++;
			System.out.println(k);
		}
		else {
			while(k>0 && a[k-1] <= 0) k--;
			System.out.println(k);
		}
	}
}
