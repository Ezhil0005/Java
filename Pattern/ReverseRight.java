import java.util.*;
public class ReverseRight {
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        for(int i=a;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
