import java.util.*;
public class SumEven
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("Enter a number :");
         long a=obj.nextLong();
        long temp =a;
        int len=String.valueOf(a).length();
        int sumeven=0;
        int sumodd=0;
        if(a==0)
        {
            System.out.println(0);
            return;
        }
       while(temp>0)
       {
        int c=(int)temp%10;
        if(c%2==0)
        {
          sumeven+=c;
           
        }
        else
        {
          sumodd+=c;
          
        }
        temp/=10;
        
       }
       System.out.println(sumeven-sumodd);
    }
        
    
}