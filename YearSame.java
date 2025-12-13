import java.util.*;
public class YearSame
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	     System.out.print("Enter two years: ");
	    int a= obj.nextInt();
	    int b= obj.nextInt();
	    int c=a%10;
	    int d=b%10;
	    if(c==d)
	    {
	        System.out.print("two given years have the same last digit.");
	    }
	   else
	   System.out.print("two given years have the different last digit.");
	}
}
