import java.util.*;
public class SideValid
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	     System.out.print("Enter three Sides: ");
	    int a= obj.nextInt();
	    int b= obj.nextInt();
	    int c=obj.nextInt();
	    if((a+b>c) && (a+c>b) && (c+b>a))
	    {
	        System.out.print("It is a valid Triangle");
	    }
	    else
	    System.out.print("It is not a valid Triangle");
	   
	}
}
