
import java.util.*;
public class DiffOddorEven

{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
        System.out.print("enter a numbers: ");
	    int a=obj.nextInt();
		int b=obj.nextInt();
		int c=a-b;
	  
	    	if((c&1)==0)
	    	System.out.print("even");
	    	else
		System.out.print("odd");
	
	}
}