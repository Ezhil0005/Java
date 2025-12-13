import java.util.*;
public class Bill {
    public  static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter the total bill amount:");
        float a=obj.nextInt();
        float b=a/3;
        System.out.printf("The amount to be paid by one person is: "+ "%.2f",b);
    }
}
