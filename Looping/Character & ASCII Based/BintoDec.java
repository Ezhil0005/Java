import java.util.*;
public class BintoDec
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("enter a binary value: ");
        String a=obj.nextLine();
        int c=Integer.parseInt(a,2);
        System.out.println("The decimal value is :"+c);

}

}