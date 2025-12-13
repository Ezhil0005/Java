
import java.util.*;
public class NoOfDigit

{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
        System.out.print("enter a number: ");
        int a=obj.nextInt();
        if((a%10)==a)
        {
            System.out.println(a+" is one digit");
        }
        else if(a%100==a)
        {
            System.out.print(a+" is two digit number");
        }
        else if(a%1000==a){
            System.out.print(a+" is three digit number");
        }
        else{
		System.out.print(a+" is more than three digit");
        }
    
	}
}

