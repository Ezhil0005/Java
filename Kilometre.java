import java.util.*;
public class Kilometre{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Kilometer:");
        double km=obj.nextDouble();
        System.out.println(km + " Kilometer is equal to "+ km*1000 +" Meters");
    }
}