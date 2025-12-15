import java.util.*;
public class Amstrong
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.print("enter a Number:");
        int a=obj.nextInt();
        int temp2=a;
        int n=0;
        int ams=0;
         int temp=a;
       while(temp>0)
       {
        int b=temp%10;
       n++;
        temp/=10;
       }
       while(temp2>0)
       {
        int c=temp2 % 10;
        ams+=Math.pow(c,n);
        temp2/=10;
       }
       if(ams==a)
        System.out.println("The digit "+a+" is Amstrong");
    else
        System.out.println("The digit "+a+" is not Amstrong");
    }
}