import java.util.*;
public class Cake
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner (System.in);
	   	System.out.print("Enter total No.of eggs: ");
	    int egg=obj.nextInt();
	   	System.out.print("Enter no.of eggs required to make a Cake :");
	   	int egg_for_cake=obj.nextInt();
	   	System.out.println("Total cake can be made :"+egg/egg_for_cake);
	   	System.out.println("Remaining Egg: "+egg%egg_for_cake);
	    	
	
	}
}
