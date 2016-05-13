import java.util.Scanner;

public class Lucky122A {

	public static void main(String[] args) {
		int[] lucky = {4,7,47,74,447,474,477,744,747,774};
		Scanner s = new Scanner(System.in);
		int n  = s.nextInt();
		String output = "NO";
		for(int i=0; i<lucky.length; i++) {
			if (n%lucky[i] == 0) output="YES";
		}
		System.out.println(output);
	}

}
