import java.util.*;
public class Arrow{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=a;j++)
            {
                if(i==1||j==1||i+j==a+1||i==j&&j>a/2)
                System.out.print("* ");
            else System.out.print("  ");
            }
            System.out.println();
        }
    }
}