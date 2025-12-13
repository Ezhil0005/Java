import java.util.*;
public class CeltoFraen {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter celcius ");
        double celcius=obj.nextDouble();
        double farenheit=(celcius*(9.0/5.0))+32;
        System.out.printf("The farenheit is:"+ "%.4f",(farenheit));
    }
}
