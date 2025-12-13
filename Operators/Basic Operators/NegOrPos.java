import java.util.Scanner;
public class NegOrPos
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
		System.out.println((a<0)?"Negative":"Positive");
	}
}
