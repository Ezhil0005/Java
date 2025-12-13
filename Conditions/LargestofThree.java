
import java.util.*;
public class LargestofThree

{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
        System.out.print("enter three number: ");
	    int a=obj.nextInt();
		int b=obj.nextInt();
		int c=obj.nextInt();
	    	if(a>=b && a>=c)
	    	System.out.print(a+" is greater");
	    	else if(b>=a && b>=c)
		System.out.print(b+" is greater");
	else
		System.out.print(c+" is greater");
	
	}
}