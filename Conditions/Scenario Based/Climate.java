import java.util.*;
public class Climate{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Temperature: ");
        double temp=obj.nextDouble();
        if(temp<15)
        {
            System.out.print("cold");
        }
        else if((temp>=15)&&(temp<30))
        {
            System.out.print("pleasant");
        }
        else if((temp>30)&&(temp<40))
        {
            System.out.print("hot");
        }
        else
        {
            System.out.print("heatwave");
        }
       

    }
}
