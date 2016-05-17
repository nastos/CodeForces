import java.util.Scanner;
public class SummerCamp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String st = "12345678910";
		for (int i=11; i<500; i++) st += i;
		System.out.println(st.charAt(s.nextInt()-1));
	}
}
