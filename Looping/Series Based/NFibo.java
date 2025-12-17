import java.util.*;
public class NFibo
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number: ");
         int a=obj.nextInt();
         int b=0;
         int c=1;
         System.out.print(0 +" "+ 1+" ");
int temp=0;
     for(int i=2;i<a;i++)
        {
           temp=c+b;
           System.out.print(temp+" ");
           b=c;

           c=temp;


        }
         }
         }
        
        
       
        
    