
import java.util.*;
public class DivisibleBy3and5

{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
        System.out.print("enter a number: ");
        int a=obj.nextInt();
        

        if(a%3==0 && a%5==0)
        {
            System.out.println(a+" is divisible by 3 and 5");
        }
        else{
		System.out.print(a+" is not divisible by 3 and 5");
        }
	}
}

