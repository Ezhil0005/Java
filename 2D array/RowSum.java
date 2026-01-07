import java.util.*;
public class RowSum
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int arr[][]=new int[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                arr[i][j]=obj.nextInt();
            }
        }
for(int i=0;i<a;i++)
        {       
            int sum=0; 
            for(int j=0;j<b;j++)
            {
                sum+=arr[i][j];
            }
            System.out.println("The sum of row "+i+" is:"+sum);
        }
    }
}