import java.util.*;
public class Pe
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number: ");
         int a=obj.nextInt();
         int fact=1;
         for(int i=1;i<=a;i++)
         {
            int temp=i;
            
            int sum=0;
            while(temp>0)
            {
                int b=temp%10;
                for(int j=1;j<=b;j++)
                {
                    fact=fact*j;
                }
                sum+=fact;
                fact=1;
                temp/=10;
            }
            if(sum==i)
                System.out.print(i+" ");
         }
         }
        
        }
       
        
    