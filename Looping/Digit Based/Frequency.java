import java.util.*;
public class Frequency
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("Enter a number :");
         long a=obj.nextLong();
        long temp =a;
       
       for(int i=0;i<=9;i++)
       {
        int count=0;
        temp=a;
        while(temp>0)
        {
            int c=(int)temp%10;
            if(i==c)
            {
                count++;
            }
            temp/=10;
        }
        if(count>0)
        {
            System.out.println(i +"is "+count);
        }
        
       }
     
        
    }
}