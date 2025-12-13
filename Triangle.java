import java.util.*;
public class Triangle
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	     System.out.print("Enter Three Sides: ");
	    int s1= obj.nextInt();
	    int s2= obj.nextInt();
	    int s3= obj.nextInt();
	    if((s1==s2)&&(s2==s3))
	    {
	        System.out.print("Equlateral Triangle");
	    }
	    else if((s1!=s2)&&(s2!=s3)&&(s1!=s3)
	    {
	        System.out.print("Scalene Triangle");
	    }
	    else
		System.out.println("Isoselecs Triangle");
	}
}
