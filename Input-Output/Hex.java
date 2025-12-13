import java.util.Scanner;
public class Hex
{
	public static void main(String[] args) {
	    Scanner obj = new Scanner(System.in);
	    char a = obj.next().charAt(0);
	    int b = Integer.parseInt(String.valueOf(a),16);
		System.out.print(b);
	}
}