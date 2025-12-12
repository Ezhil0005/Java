
import java.util.*;
public class Atm

{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	    	System.out.print("enter amount:");
	    	int  amount=obj.nextInt();
	    	int a500=amount/500;
	    	int a500r=amount%500;
	    	int a200=a500r/200;
	    	int a200r=a500r%200;
	    	int a100=a200r/100;
	    	int a100r=a200r%100;
		System.out.println("500 Note: "+a500);
		System.out.println("200 Note: "+a200);
		System.out.print("100 Note: "+a100);
	
	}
}