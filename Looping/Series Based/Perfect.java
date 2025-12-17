import java.util.*;
public class Perfect
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number: ");
         int a=obj.nextInt();
        for(int i=1;i<=a;i++)
        {
            int temp=i;
            int sum=0;
            for(int j=1;j<temp;j++)
            {
                if(temp%j==0)
                {
                    sum+=j;
                }
            }
            if(sum==i)
                System.out.print(i+" ");
        }
        
         }
         }
        
        
       
        
    