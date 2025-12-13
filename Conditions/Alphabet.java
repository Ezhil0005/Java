
import java.util.*;
public class Alphabet
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
        System.out.print("enter a character: ");
        char a=obj.next().charAt(0);
        
        if(a>='A'&&a<='Z'  || a>='a'&&a<='z')
        {
            System.out.print(a+ " is Alphabet");
        }
        else
        {
            System.out.print(a+" is not Alphabet");
        }
    
	}
}

