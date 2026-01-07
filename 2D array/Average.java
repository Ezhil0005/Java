import java.util.*;
public class Average
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int arr[][]=new int[a][b];
        int sum=0;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                arr[i][j]=obj.nextInt();
                sum+=arr[i][j];
            }
        }
        double avg=(double)sum/(a*b);
        System.out.println("Average is "+avg);
    }
}