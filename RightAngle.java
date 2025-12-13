import java.util.*;
public class RightAngle
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	     System.out.print("Enter Three Sides: ");
	    int s1= obj.nextInt();
	    int s2= obj.nextInt();
	    int s3= obj.nextInt();
	    if(((s1*s1)+(s2*s2))==s3*s3)
	    {
	        System.out.print("Right Angled Triangle");
	    }
	    else
		System.out.println("Not a Right Angled Triangle");
	}
}
