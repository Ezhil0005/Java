
import java.util.*;
public class OddorEven

{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
        System.out.print("enter a numbers: ");
	    int a=obj.nextInt();
	  
	    	if((a&1)==0)
	    	System.out.print("even");
	    	else
		System.out.print("odd");
	
	}
}