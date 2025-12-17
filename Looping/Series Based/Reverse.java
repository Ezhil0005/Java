import java.util.*;
public class Reverse
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=obj.nextInt();
        for(int i=a;i>0;i--)
        {
            System.out.print(i+" ");
        }
    }
}