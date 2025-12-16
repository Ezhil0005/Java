import java.util.*;
public class SquareCube
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("Enter a number :");
         long a=obj.nextLong();
        long temp =a;
        int square=0;
        int cube=0;
        while(temp>0)
        {
          int b=(int)temp%10;
          square+=b*b;
          cube+=b*b*b;
          temp/=10;
        }
        System.out.println("Sum of the Squares is: "+square);
         System.out.println("Sum of the cube is: "+cube);

    }
      
}