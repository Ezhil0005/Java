import java.util.*;
public class PerSquare
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.print("enter a Number:");
        int a=obj.nextInt();
        int root=(int) Math.sqrt(a);
        if(root*root==a)
          System.out.println("It is perfect square");
       else
        
        System.out.println("it is not a perfect square");
    }
}