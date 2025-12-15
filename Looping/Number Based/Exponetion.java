import java.util.*;
public class Exponetion
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.print("Enter a two Number:");
        int a=obj.nextInt();
        int b=obj.nextInt();
        int pro=1;
        for(int i=1;i<=b;i++)
        {
            pro*=a;
        }
            System.out.println("The exponetion is :"+pro);
       
           
}
}