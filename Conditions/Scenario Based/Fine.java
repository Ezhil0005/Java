import java.util.*;
public class Fine{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Speed: ");
        int speed=obj.nextInt();
        String b="";
       if(speed>100)
       {
        b=" vehicle speed does not exceeds 100 km/h,fine issued";
       }
       else
        b="speed is within limit";
    System.out.println(b);
}

}