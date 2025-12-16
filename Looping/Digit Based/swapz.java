import java.util.*;
public class swapz 
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("Enter a number :");
         long a=obj.nextLong();
        long temp =a;
        long temp1=a;
           int last= (int)temp%10;
          long first=0;
          int len=String.valueOf(a).length();
          int power=(int)Math.pow(10,(len-1));
          int power2=(int)Math.pow(10,(len-2));
           while(temp>0)
           {
            first=temp;
            temp=(int)temp/10;

           }
           long x=a%power;
           long y=x/10;
           long fin=(last*power2)+y;
           long fin1=(fin*10)+first;
        System.out.println(fin1);
    }
}