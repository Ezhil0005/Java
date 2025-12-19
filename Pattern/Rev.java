import java.util.*;
public class Rev {
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
       for(int i=a;i>=1;i--)
       {
        for(int j=1;j<=a-i;j++)
        {
            System.out.print(" ");
        }
        for(int k=1;k<=(2*i)-1;k++)
        {
           
            System.out.print("*");
       
        }
        System.out.println();
       }
        }
    }

