import java.util.*;
public class Magic
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number: ");
         int a=obj.nextInt();
        
        for(int i=1;i<=a;i++)
        {
           int sum=i;
       
         
         while(sum>=10)
         {
              int temp=sum;
          sum=0;
            while(temp>0)
            {
         int b=temp%10;
         sum+=b;
         temp/=10;
            }
         }
         if(sum==1)
         System.out.print(i+" ");


        }


        }
         }
         
        
        
       
        
    