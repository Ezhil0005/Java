import java.util.*;
public class Seven
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number: ");
         int a=obj.nextInt();
         for(int i=7;i<=a;i++)
         {
            int b=i%10;
            if(b==7 || i%7==0)
            {
               System.out.print(i+" ");
            }
         }


        }
         }
         
        
        
       
        
    