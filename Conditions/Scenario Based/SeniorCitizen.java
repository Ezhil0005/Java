import java.util.*;
public class SeniorCitizen{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Your age: ");
        int age=obj.nextInt();
        if(age>=60)
        {
            System.out.print("You are eligible for senior citizen benefits");
        }
        else
        {
            System.out.print("You are not eligible for senior citizen benefits");
        }
       

    }
}
