import java.util.*;
public class LeapYear
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	     System.out.print("Enter a year: ");
	    int a= obj.nextInt();
	    if(a%4==0)
	    {
	        System.out.print("It is a Leap year");
	    }
	   else
	   System.out.print("It is not Leap year");
	}
}
