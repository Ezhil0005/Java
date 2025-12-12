
import java.util.*;
public class LastTwo

{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
        System.out.print("enter a number: ");
        int a=obj.nextInt();
        int b=a%10;
        int c=a/10;
        int d=c%10;
        if(b==d)
        {
            System.out.println(a+" has same two digits at last");
        }
        else{
		System.out.print(a+" does not have same two digits at last");
        }
    
	}
}

