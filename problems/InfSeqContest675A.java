import java.util.Scanner;

public class InfSeqContest675A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		long a=s.nextLong();
		long b=s.nextLong();
		long c=s.nextLong();
		if (c==0 && a!=b) System.out.println("NO");
		else if ((a==b) || ( (b-a)%c == 0 && (b-a)/c > 0)) System.out.println("YES");
		else System.out.println("NO");
	}

}
