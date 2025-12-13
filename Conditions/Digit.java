
import java.util.*;
public class Digit
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
        System.out.print("enter a character: ");
        char a=obj.next().charAt(0);
        
        if(a>='0'&&a<='9')
        {
            System.out.print(a+ " is digit");
        }
        else
        {
            System.out.print(a+" is not digit");
        }
    
	}
}

