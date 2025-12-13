
import java.util.*;
public class Season
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
        System.out.print("enter month: ");
        int month=obj.nextInt();
        switch(month)
        {
           case 12:
            case 1:
            case 2:
            System.out.print("Winter");
            break;
            case 3:
                case 4:
                    case 5:
            System.out.print("Spring");
            break;
            case 6:
                case 7:
                    case 8:
            System.out.print("Summer");
            break;
            case 9:
                case 10:
                    case 11:
            System.out.print("Autumn");
            break;
           
            
            default:
            System.out.print("Invalid Input");


        }
       
	}
}

