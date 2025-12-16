import java.util.*;
public class FirstEven
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("Enter a number :");
        int a=obj.nextInt();
        int temp=a;
        int c=0;
        while(temp!=0)
        {
            c=temp;
            temp/=10;

        }
        if(c%2==0)
        System.out.println("even");
    else
        System.out.println("odd");
    }
}