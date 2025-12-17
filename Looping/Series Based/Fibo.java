import java.util.*;
public class Fibo
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number: ");
         int a=obj.nextInt();
         int b=0;
         int c=1;
         System.out.print(0 +" "+ 1+" ");
int temp=c+b;
     while(temp<=a)
        {
            System.out.print(temp+" ");
            b=c;
           c=temp;
           temp=b+c;
          


        }
         }
         }
        
        
       
        
    