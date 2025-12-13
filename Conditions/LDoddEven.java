
import java.util.*;
public class LDoddEven

{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
        System.out.print("enter a number: ");
        int a=obj.nextInt();
        int b=a%10;

        if((b&1)==0)
        {
            System.out.println(b+" is even");
        }
        else{
		System.out.print(b+" is odd");
        }
	}
}

