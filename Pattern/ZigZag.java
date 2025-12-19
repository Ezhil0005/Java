import java.util.*;
public class ZigZag {
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        System.out.println(1);
   for(int i=1;i<=a;i++)
   {

    for(int j=0;j<=a;j++)
    {
        if((i+j)%2==0)
        System.out.print("*");
    else
                System.out.print(" ");

    }
    System.out.println();
   }
        }
    }

