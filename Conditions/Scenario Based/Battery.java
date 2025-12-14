import java.util.*;
public class Battery{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Your Battery: ");
        int battery=obj.nextInt();
        if(battery<=19)
        {
            System.out.print("low Battery,Charge immediately");
        }
        else if((battery>19 )&&(battery<=50))
        {
            System.out.print("50% Consumed");
        }
        else{
            System.out.println("Fully Charged Plug out Immediately");
        }
       

    }
}
