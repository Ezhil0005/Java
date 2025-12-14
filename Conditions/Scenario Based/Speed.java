import java.util.*;
public class Speed{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Speed: ");
        int speed=obj.nextInt();
        String b="";
       if(speed<100)
       {
        b=" vehicle speed does not exceeds 100 km/h";
       }
       else
        b=" vehicle speed exceeds 100 km/h";
    System.out.println(b);
}

}