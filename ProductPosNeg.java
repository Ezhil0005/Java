
import java.util.*;
public class ProductPosNeg

{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
        System.out.print("enter two number: ");
        int a=obj.nextInt();
        int b=obj.nextInt();
        if((a*b)<0)
        {
            System.out.println("The product of "+a+" and "+b+" is Negative");
        }
        else{
		System.out.print(" The product of "+a+" and "+b+" is Positive");
        }
    
	}
}

