import java.util.*;
public class Withdraw{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Amount to be withdrawed: ");
        int amount=obj.nextInt();
        int balance= 5000;
      
        if((amount<=balance) && (amount%100)==0)
        {
            System.out.print("You can withdraw cash");

        }
        else
        {
          System.out.print("Enter a valid amount");

        }
       obj.close();

    }
}
