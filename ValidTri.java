import java.util.*;
public class ValidTri
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	     System.out.print("Enter three angle: ");
	    int a= obj.nextInt();
	    int b= obj.nextInt();
	    int c=obj.nextInt();
	    if(((a+b+c)==180) && (a>0&&b>0&&c>0))
	    {
	        System.out.print("It is a valid Triangle");
	    }
	    else
	    System.out.print("It is not a valid Triangle");
	   
	}
}
