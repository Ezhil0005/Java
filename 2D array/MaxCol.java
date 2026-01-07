import java.util.*;
public class MaxCol
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
       int max=0;
       for(int j=0;j<b;j++)
       {
        max=Integer.MIN_VALUE;
        for(int i=0;i<a;i++)
        {
            if(max<arr[i][j])
                max=arr[i][j];
        }
        System.out.println("The maximum element int col "+j+" is "+max);
       }
       
        }
    }
