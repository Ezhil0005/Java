import java.util.*;
public class batteryLevel{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter batteryLevel: ");
        double battery=obj.nextDouble();
        if(battery<20)
        {
            System.out.print("low");
        }
        else if((battery>=20)&&(battery<50))
        {
            System.out.print("moderate");
        }
        else
        {
            System.out.print("full");
        }
       

    }
}
