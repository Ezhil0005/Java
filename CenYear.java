import java.util.*;
public class CenYear
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	     System.out.print("Enter a year: ");
	    int a= obj.nextInt();
	    int b=a%100;
	    int c=a/100;
	    if(b==c)
	    {
	        System.out.print("first two digits and last two digits of a year are equal.");
	    }
	   else
	   System.out.print("first two digits and last two digits of a year are not equal.");
	}
}
