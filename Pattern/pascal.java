import java.util.*;
public class Pascal {
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        System.out.println(1);
   for(int i=1;i<=a;i++)
   {
    int n=1;
    for(int k=1;k<=a-i;k++)
    {
        System.out.print(" ");
    }
    for(int j=0;j<i;j++)
    {
        System.out.print(n+" ");
        n=n*(i-j)/(j+1);
    }
    System.out.println();
   }
        }
    }

