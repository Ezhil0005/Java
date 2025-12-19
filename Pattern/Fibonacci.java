import java.util.*;
public class Palindrome {
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        System.out.println(1);
   for(int i=1;i<=a;i++)
   {
    for(int j=1;j<=a-i;j++)
    {
        System.out.print(" ");
    }
    int n=1;
    for(int k=1;k<=i;k++)
    {
      System.out.print(k);
    }
    for(int k=i-1;k>=1;k--)
    {
        System.out.print(k);
    }
    System.out.println();
    }
    }
    
   }
        


