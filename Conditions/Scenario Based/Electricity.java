import java.util.*;
public class Electricity{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter unit: ");
        int unit=obj.nextInt();
        double bill=0;
        if(unit<=100)
        {
            System.out.print("No charge");
        }
        else if((unit>100)&&(unit<=300))
        {
            bill=(unit-100)*5;
            System.out.println("Charge is: "+bill);
        }
        else
        {
            bill=(200*5)+((unit-300)*10);
            System.out.println("Charge is: "+bill);
            if(unit>500)
            {
                bill+=bill*0.1;
                System.out.print("The bill is: "+bill);

            }

        }
       obj.close();

    }
}
