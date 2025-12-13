import java.util.*;
public class Quadrant
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	     System.out.print("Enter two points: ");
	    int x= obj.nextInt();
	    int y= obj.nextInt();
	    if((x==0) &&(y==0))
	    {
	        System.out.print("Lies at the orgin");
	    }
	    else if(x==0)
	    {
	        System.out.print("Lies at the x axis");
	    }
	    else if(y==0)
	    {
	        System.out.print("Lies at the y axis");
	    }
	    else if((x>0)&&(y>0))
	    {
	        System.out.print("Lies in Quadrant I");
	    }
	    else if((x<0)&&(y>0))
	    {
	        System.out.print("Lies in Quadrant II");
	    }
	    else if((x<0)&&(y<0))
	    {
	        System.out.print("Lies in Quadrant III");
	    }
	    else if((x>0)&&(y<0))
	    {
	        System.out.print("Lies in Quadrant IV");
	    }
	}
}
