import java.util.*;
public class Hollow {
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=a;j++)
            {
                if(i==1||i==a||j==1||j==a)
                {
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }
}
