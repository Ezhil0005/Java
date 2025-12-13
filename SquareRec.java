import java.util.*;
public class SquareRec
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	     System.out.print("Enter four sides: ");
	    int a= obj.nextInt();
	    int b= obj.nextInt();
	    int c=obj.nextInt();
	    int d=obj.nextInt();
	    if((a==b)&&(b==c)&&(c==d))
	    {
	        System.out.print("It forms a square");
	    }
	    else if((a==c)&&(b==d))
	    System.out.print("It forms a rectangle");
	   else
	   System.out.print("neithor Square nor rectangle");
	}
}
