import java.util.*;
public class HollowReverse {
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
            for(int k=1;k<=i;k++)
                if(k==1||i==a)
            System.out.print("* ");
        else
            System.out.print(" ");
        System.out.println();
        }
    }
}
