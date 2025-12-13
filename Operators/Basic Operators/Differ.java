import java.util.Scanner;
public class Differ
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = a-b;
		System.out.println((c<0)?-c:c);
	}
}
