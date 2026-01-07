import java.util.*;
public class DiagnolSum
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        
        int arr[][]=new int[a][a];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                arr[i][j]=obj.nextInt();
            }
        }
        int sum=0;int sum2=0;
        for(int i=0;i<a;i++)
        {       
            
            for(int j=i;j<a;j++)
            {
                if(i==j)
                 sum+=arr[i][j];
               
            }
            
        }
            for(int i=0;i<a;i++)
            {
                
                for(int j=0;j<a;j++)
                {
                    if(i+j==a-1)
                    {
                        sum2+=arr[i][j];
                    }
                }
            }
            System.out.println("Diagonal 0ne:"+sum);
                        System.out.println("Diagonal two:"+sum2);
            System.out.println("total sum:"+(sum+sum2));

        }
    }
