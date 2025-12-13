import java.util.Scanner;
public class Bitwiseand
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = a&(a-1);
		System.out.println((b==0)?"Power of 2":"Not power of 2");
	}
}
