
import java.util.*;
public class DivideBy2and7not8

{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
        System.out.print("enter a number: ");
        int a=obj.nextInt();


        if((a%2==0 && a%5==0) && (a%8!=0))
        {
            System.out.println(a+" is divisible by 2 and 5 but not by 8");
        }
        else{
		System.out.print(a+" does not satisfy the condition");
        }
    
	}
}

