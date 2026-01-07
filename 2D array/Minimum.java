import java.util.*;
public class Minimum
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
       int min=Integer.MAX_VALUE;
       for(int i=0;i<a;i++)
       {
        for(int j=0;j<b;j++)
        {
            if(min>arr[i][j])
                min=arr[i][j];
        }
       }
       System.out.println("The minimum element is "+min);
        }
    }
