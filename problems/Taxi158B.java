import java.util.Scanner;
public class Taxi158B {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] g = new int[5];
		for (int i=0; i<n; i++) {
			g[s.nextInt()]+=1;
		}
		int total = g[4] + g[3];
		g[1] = g[1] - g[3];
		if (g[1] < 0) g[1] = 0;
		total += g[2]/2;
		if (g[2] % 2 == 1) g[1] += 2;
		total += (int)Math.ceil(g[1]/4.0);
		System.out.println(total);
	}
}
