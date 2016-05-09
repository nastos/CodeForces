import java.util.Scanner;

public class StringTask118A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String l = s.nextLine().toLowerCase();
		StringBuilder output = new StringBuilder("");
		String vowels = "aeiouy";
		for (int i=0; i<l.length();i++){
			if (vowels.contains(l.substring(i,i+1)) == false) {
				output.append(".");
				output.append(l.substring(i,i+1));
			}
		}
		System.out.println(output);
	}
}