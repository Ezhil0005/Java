import java.util.*;
public class Table
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=obj.nextInt();
        for(int i=1;i<=10;i++)
        {
         System.out.println(i+" x "+a+"="+a*i);
        }
        
        
    }
}