import java.util.*;
public class Power
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number: ");
         int a=obj.nextInt();
         for(int i=1;i<=a;i++)
         {
            int temp=i;
           while(temp%2==0)
           {
            temp/=2;
           }
           if(temp==1)
           {
            System.out.print(i+" ");
           }
         }
    
        }


        }
         
         
        
        
       
        
    