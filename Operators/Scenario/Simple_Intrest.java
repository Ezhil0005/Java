import java.util.*;
public class Simple_Intrest{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter principal: ");
        double pri=obj.nextDouble();
        System.out.print("Enter rate: ");
        double rate=obj.nextDouble();
        System.out.print("Enter time: ");
        double time=obj.nextDouble();
        double si=(pri*rate*time)/100;
        System.out.printf("Simple Intrest is: "+"%.2f" ,si);
        }
}