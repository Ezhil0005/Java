import java.util.*;
public class MaxSum
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
       int dum=Integer.MIN_VALUE;
       for(int i=0;i<a;i++)
       {
        int sum=0;
        
        for(int j=0;j<b;j++)
        {
                sum+=arr[i][j];
        }
        if(dum<sum)
            dum=sum;
       
       }
        System.out.println("The maximum sum of row is "+dum);
       
        }
    }
