import java.util.*;
public class Multiplication
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int arr[][]=new int[a][b];
        int brr[][]=new int[a][b];
        int res[][]=new int[a][b];
        System.out.println("Matrix 1");

        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                arr[i][j]=obj.nextInt();
            }
        }
        System.out.println("Matrix 2");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                brr[i][j]=obj.nextInt();
            }
        }
       
       for(int i=0;i<a;i++)
       {
        int sum=0;
        for(int j=0;j<b;j++)
        {
            for(int k=0;k<b;k++)
           res[i][j]+=arr[i][k]*brr[k][j];
           
        }
       
        
       
       }
       for(int i=0;i<a;i++)
       {
        for(int j=0;j<b;j++){
       
       System.out.print(res[i][j]+" ");
}
System.out.println();}
        }
    }
