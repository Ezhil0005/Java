import java.util.*;
public class NPrime
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number: ");
         int a=obj.nextInt();
         int count=0;
          int num=2;
         while(count<a)
         {
            int prime=0;
       
         for (int i=2;i<=num;i++)
         {
             
           if(num%i==0)
           {
            prime++;
           }
           
         }
          if(prime==1)
          {
                 System.out.print(num+" ");
                 count++;
          }
         num++;
        }
       
        
    }
}