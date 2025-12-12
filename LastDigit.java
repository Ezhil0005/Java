
import java.util.*;
public class LastDigit

{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
        System.out.print("enter a number: ");
        int a=obj.nextInt();
        int b=a%10;

        if(b%3==0)
        {
            System.out.println(b+" is divisible by 3");
        }
        else{
		System.out.print(b+" is not divisible by 3");
        }
	}
}

