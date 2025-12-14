import java.util.*;
public class Vote{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Your age: ");
        int age=obj.nextInt();
        if(age>=18)
        {
            System.out.print("You are eligible to vote");
        }
        else
        {
            System.out.print("You are not eligible to vote");
        }
       

    }
}
