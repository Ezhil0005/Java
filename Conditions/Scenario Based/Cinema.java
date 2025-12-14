import java.util.*;
public class Cinema{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the day: ");
        String dayn=obj.nextLine();
        int price=0;
       switch(dayn.toLowerCase())
       {
        case "monday":
        case "tuesday":
        case "wednesday":
        case "thursday":
        case "friday":
        price=220;
        break;
        case "saturday":
        case "sunday":
            price=250;
            break;
            default:
                System.out.println("enter a valid day");
                return;
       }
    System.out.println("Ticket price is :"+price);
}
}