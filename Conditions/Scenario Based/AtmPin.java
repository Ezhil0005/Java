import java.util.*;
public class AtmPin{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Your Pin: ");
        int pin=obj.nextInt();
        int pinstrd= 1364;
      
        if(pin==pinstrd)
        {
            System.out.print("Correct pin");

        }
        else
        {
          System.out.print("wrong pin");

        }
       obj.close();

    }
}
