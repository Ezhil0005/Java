
import java.util.*;
public class grade
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
        System.out.print("enter your mark: ");
        int mark=obj.nextInt();
        switch(mark/10)
        {
           case 10:
            case 9:
            System.out.print('A');
            break;
             case 8:
                case 7:

            System.out.print('B');
            break;
             case 6:
                case 5:
            System.out.print('C');
            break;
            default:
            System.out.print("Fail");


        }
       
	}
}

