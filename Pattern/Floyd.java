import java.util.*;
public class Floyd {
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int n=1;
     for(int i=1;i<=a;i++)
     {
      for(int j=1;j<=i;j++)
      {
        System.out.print(n);
        n=n+1;
      }
      System.out.println();
     }
        }
    }

