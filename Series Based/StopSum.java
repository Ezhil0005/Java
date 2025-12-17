import java.util.*;
public class StopSum
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int sum=0;
       while(true)
        {
            
          int b=obj.nextInt();
          if(b<0)
            break;
          sum+=b;

        }
        System.out.println("The sum is: "+sum);
        
    }
}