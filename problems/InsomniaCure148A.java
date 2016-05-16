import java.util.Scanner;

public class InsomniaCure148A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		int l = s.nextInt();
		int m = s.nextInt();
		int n = s.nextInt();
		int d = s.nextInt();
		int[] list = new int[d+1];
		int sum=0;
		for (int i=1; k*i<=d; i++) list[k*i]++;
		for (int i=1; l*i<=d; i++) list[l*i]++;
		for (int i=1; m*i<=d; i++) list[m*i]++;
		for (int i=1; n*i<=d; i++) list[n*i]++;
		for (int i=1; i<=d; i++) if (list[i]>0) sum++;
		System.out.println(sum);
	}
}
