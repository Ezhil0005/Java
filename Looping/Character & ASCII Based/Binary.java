import java.util.*;
public class Binary
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("enter a binary value: ");
        long a=(long) obj.nextLong();
        int one=0;
        int zero=0;
        while(a!=0)
        {
            long b=a%10;
            a/=10;
            if(b==1)
            {
                one++;
            }
            else
                zero++;
        }
        System.out.println("ones :"+one);
         System.out.println("Zero :"+zero);

}

}