import java.util.*;
public class Greater
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("Enter a number :");
         long a=obj.nextLong();
        long temp =a;
        int greater=(int)temp%10;
       while(temp>0)
       {
        int c=(int)temp%10;
        if(c>greater)
            greater=c;
        temp/=10;
       }
     System.out.println(greater);
       }
    }
        
    
