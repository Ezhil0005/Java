import java.util.Scanner;
public class Greatof3
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    int max = (a>b)?a:b;    
	    max = (max>c)?max:c;
	    
		System.out.println(max);
	}
}
