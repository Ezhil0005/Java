import java.util.*;
public class DectoBin 
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("enter a binary value: ");
        int a=obj.nextInt();
        int temp=a;
        String binary="";
        if(a==0)
            binary="0";
        while(temp!=0)
        {
            int c=temp%2;
            binary=c+binary;
            temp/=2;
        }
        System.out.println("The binary value is :"+binary);

}

}