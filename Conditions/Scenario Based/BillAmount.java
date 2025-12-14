import java.util.*;
public class BillAmount{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Bill Amount: ");
        int bill=obj.nextInt();
        if((bill>=500)&&(bill<1000))
        {
            System.out.println("discount on your purchase is: 10%");
            System.out.printf("After discount the total bill is: "+"%.2f",(bill-(bill*(10.0/100))));

        }
        else if((bill>=1000)&&(bill<3000))
        {
            System.out.println("discount on your purchase is: 20%");
            System.out.printf("After discount the total bill is: "+"%.2f",(bill-(bill*(20.0/100))));

        }
        else if(bill>=3000)
        {
            System.out.println("discount on your purchase is: 25%");
            System.out.printf("After discount the total bill is: "+"%.2f",(bill-(bill*(25.0/100))));

        }
        else{
            System.out.print("The bill Amount is not reached for discount");
        }

    }
}
