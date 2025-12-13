
import java.util.*;
public class AsciiOddEven

{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
        System.out.print("enter a character: ");
        char a=obj.next().charAt(0);
        int b=(int)a;
        if((b&1)==0)

        {
            System.out.print(a+ " is Even");
        }
        else{
		System.out.print(a+ " is Odd");
        }
    
	}
}

