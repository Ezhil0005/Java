import java.util.*;
public class Square {
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
          System.out.print("Enter a number: ");
        int a=obj.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=a;j++)
            {
                 System.out.print("* ");
            }
            System.out.println("");
           
        }
    }
}
