import java.util.*;
public class Butterfly {
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
     for(int i=1;i<=a;i++)
     {
      for(int j=1;j<=a*2;j++)
      {
        if(j>i&&j<a*2-i+1)
            System.out.print(" ");
        else
        System.out.print("*");
      }
      System.out.println();
     }
     for(int i=a-1;i>=1;i--)
     {
      for(int j=1;j<=a*2;j++)
      {
        if(j>i&&j<a*2-i+1)
            System.out.print(" ");
        else
        System.out.print("*");
      }
      System.out.println();
     }
    }
}
