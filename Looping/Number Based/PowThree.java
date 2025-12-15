import java.util.*;
public class PowThree
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.print("Enter a Number:");
        int a=obj.nextInt();
        int temp=a;
        while(temp%3==0)
        {
            temp/=3;
        }
        
           if(temp==1)
            System.out.println("It is a power of 3");
        else
             System.out.println("It is a not power of 3");
    }
}