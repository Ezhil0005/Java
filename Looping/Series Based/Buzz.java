import java.util.*;
public class Buzz
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number: ");
         int a=obj.nextInt();
         for(int i=1;i<=a;i++)
         {
            int temp=i%10;
            if(temp==7||i%7==0)
            {
                System.out.print(i+" ");
            }
         }
    
        }


        }
         
         
        
        
       
        
    