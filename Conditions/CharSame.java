
import java.util.*;
public class CharSame
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
        System.out.print("enter two character: ");
        char a=obj.next().charAt(0);
         char b=obj.next().charAt(0);
        
        if(a==b)
        {
            System.out.print("Same");
        }
        else
        {
            System.out.print("not Same");
        }
    
	}
}

