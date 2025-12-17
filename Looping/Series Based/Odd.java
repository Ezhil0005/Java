import java.util.*;
public class Odd
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=obj.nextInt();
        for(int i=1;i<=a;i++)
        {
            if(i%2!=0)
            System.out.print(i+" ");
        }
    }
}