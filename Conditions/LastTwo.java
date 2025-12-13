
import java.util.*;
public class LastTwo

{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
        System.out.print("enter two number: ");
        int a=obj.nextInt();
        int b=obj.nextInt();
        if(a%10==b%10)
        {
            System.out.println(a+" and "+b+" has same digits at last");
        }
        else{
		System.out.print(a+" and "+b+" does not have same digits at last");
        }
    
	}
}

