import java.util.*;
public class Mobile{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Mobile number: ");
        long number=obj.nextLong();
        String b="";
       if((number>999999999)&&(number<10000000000L))
       {
        b="vaild";
       }
       else{
        b=" invalid";
       }
    System.out.println(b);
}

}