import java.util.*;
public class HalfDiamond {
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
       for(int i=0;i<=a;i++)
       {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
       }

       for(int i=a-1;i>=1;i--)
       {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
       }
       

        }
    }

