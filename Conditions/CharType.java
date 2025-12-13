
import java.util.*;
public class CharType
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
        System.out.print("enter a character: ");
        char a=obj.next().charAt(0);
        
        if(a>='A'&&a<='Z')
        {
            System.out.print(a+ " is uppercase");
        }
        else if(a>='a'&&a<='z'){
		System.out.print(a+ " is lowercase");
        }
        else if(a>='0' && a<='9')
        {
            System.out.print(a+" is number");
        }
        else
        {
            System.out.print(a+" is symbol");
        }
    
	}
}

