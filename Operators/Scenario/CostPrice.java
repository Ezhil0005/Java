
import java.util.*;
public class CostPrice

{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	    	System.out.print("enter selling :");
	    double selling=obj.nextDouble();
		System.out.print("Enter Loss in % :");
		double loss=obj.nextDouble();
		double los=(1-loss/100);
		System.out.printf("Cost price :"+"%.2f",selling/los);
		obj.close();
	}
}