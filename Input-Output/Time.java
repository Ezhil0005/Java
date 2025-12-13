import java.util.Scanner;
public class Time
{
	public static void main(String[] args) {
	    Scanner obj = new Scanner(System.in);
	    int a = obj.nextInt();
	    int b = obj.nextInt();
	    int c = obj.nextInt();
		System.out.printf("%02d:%02d:%02d",a,b,c);
	}
}
