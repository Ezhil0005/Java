
import java.util.*;
public class SellingPrice

{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	    	System.out.print("enter Cost :");
	    double cost=obj.nextDouble();
		System.out.print("Enter Profit in % :");
		double profit=obj.nextDouble();
		Double pro=(cost*profit)/100;
		System.out.printf("Selling price :"+"%.2f",cost+pro);
		obj.close();
	}
}