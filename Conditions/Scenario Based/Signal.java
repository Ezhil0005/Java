import java.util.*;
public class Signal{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the signal color: ");
        String color=obj.nextLine();
        String result="";
       switch(color)
       {
        case "Red":
            result="Stop";
            break;
             case "Yellow":
            result="Ready";
            break;
             case "Green":
            result="Go";
            break;
            default:
                result="Enter a valid signal";

       }
       System.out.println(result);
      
       obj.close();

    }
}
