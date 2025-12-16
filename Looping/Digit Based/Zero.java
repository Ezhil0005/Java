import java.util.*;
public class Zero
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("Enter a number :");
         long a=obj.nextLong();
        long temp =a;
        int len=String.valueOf(a).length();
        int fin=0;
        while(temp>0)
        {
          int pow=(int)Math.pow(10,len-1);
          int b=(int)temp/pow;
          if(b!=0)
          {
            int c=b;
            fin=(fin*10)+c;
          }
          temp%=pow;
          len--;
        }
       
        System.out.println(len);
        System.out.println(fin);

    }
      
}