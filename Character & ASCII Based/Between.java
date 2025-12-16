import java.util.*;
public class Between
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
  System.out.print("enter two characters  ");
        char a=obj.next().charAt(0);
        char b=obj.next().charAt(0);
       
        for(char i=a;i<=b;i++)
        {
         System.out.print(i+" ");
        }
        
}
}