import java.util.*;
public class Mixed
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("Enter a number :");
         long a=obj.nextLong();
        long temp =a;
        int len=String.valueOf(a).length();
        int even=0;
        int odd=0;
        if(a==0)
        {
            System.out.println("even");
            return;
        }
       while(temp>0)
       {
        int c=(int)temp%10;
        if(c%2==0)
            even++;
        else
          odd++;
        temp/=10;
       }
       if(even==len)
       System.out.println("even");
      else if(odd==len)
        System.out.println("odd");
      else
     System.out.println("Mixed");
       }
    }
        
    
