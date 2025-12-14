import java.util.*;
public class Ticket{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter passenger age category: ");
        String a=obj.nextLine();
        int b=0;
       switch(a.toLowerCase())
       {
        case "adult":
            b=150;
            break;
             case "child":
            b=100;
            break;

             case "senior":
            b=125;
            break;
            default:
                System.out.println("Invaild");
                return;

       }
       System.out.println(b);

       

    }
}
