
import java.util.*;
public class MiniAtm
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
        System.out.print("enter key: ");
        int key=obj.nextInt();
        int balance=5000;
        switch(key)
        {
           case 1:
            System.out.print("Balance: "+balance);
            break;
            case 2:
                System.out.print("Enter amount to Deposit: ");
                int deposit=obj.nextInt();
                System.out.print("Balance is :"+(balance+deposit));
                break;
                case 3:
                System.out.print("Enter amount to be withdraw:");
                int withdraw=obj.nextInt();
                  System.out.print("Balance is :"+ (balance-withdraw));
                  break;


           
            
            default:
            System.out.print("Invalid Input");


        }
       
	}
}

