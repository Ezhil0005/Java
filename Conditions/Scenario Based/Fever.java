import java.util.*;
public class Fever{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter your body Temperatue: ");
        double temp=obj.nextDouble();
        if(temp>=100)
        {
            System.out.print("Fever,go and see doctor");
        }
       
        else{
            System.out.println("Normal Temperature");
        }
       obj.close();

    }
}
