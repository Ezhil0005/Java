import java.util.*;
public class FarentoCel {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Farenheit ");
        double farenheit=obj.nextDouble();
        double celcius=(farenheit-32)*(5.0/9.0);
        System.out.printf("The celcius is:"+ "%.4f",(celcius));
    }
}
