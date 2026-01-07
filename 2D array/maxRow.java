import java.util.*;
public class maxRow
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
       for(int i=0;i<a;i++)
       {
        max=Integer.MIN_VALUE;
        for(int j=0;j<b;j++)
        {
            if(max<arr[i][j])
                max=arr[i][j];
        }
        System.out.println("The maximun element int row "+i+" is "+max);
       }
       
        }
    }
