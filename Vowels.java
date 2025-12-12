
import java.util.*;
public class Vowels

{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
        System.out.print("enter a character: ");
        char a=obj.next().charAt(0);
        
        if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U'||a=='a'||a=='e'||a=='i'||a=='o'||a=='u')

        {
            System.out.print(a+ " is vowel");
        }
        else{
		System.out.print(a+ " is consonant");
        }
    
	}
}

