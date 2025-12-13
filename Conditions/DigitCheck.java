
import java.util.*;
public class DigitCheck

{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
        System.out.print("enter a number: ");
	    int a=obj.nextInt();
	  
	    	if(a>99 && a<1000)
	    	System.out.print("3 digit number");
	    	else
		System.out.print("not a 3 digit number");
	
	}
}