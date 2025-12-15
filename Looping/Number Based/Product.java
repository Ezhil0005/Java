import java.util.*;
public class Product
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.print("Enter a two Number:");
        int a=obj.nextInt();
        int b=obj.nextInt();
        int pro=b;
        for(int i=1;i<a;i++)
        {
            pro+=b;
        }
            System.out.println("The product is :"+pro);
       
           
}
}