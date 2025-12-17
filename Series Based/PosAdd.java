import java.util.*;
public class PosAdd
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int sum=0;
         int a=obj.nextInt();
         int count=0;
        while(count<a)
        {
          int b=obj.nextInt();
          if(b>0)
          {
            sum+=b;
            count++;
          }
        }
        System.out.println("The sum is: "+sum);
        
    }
}