import java.util.Scanner;
public class WordCapitalization281A {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		System.out.println(st.substring(0, 1).toUpperCase()+st.substring(1));
	}
}
