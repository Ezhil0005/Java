import java.util.*;
public class PeriofRectangle {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter length and width: " );
        int length=obj.nextInt();
         int width=obj.nextInt();

        System.out.printf("The Perimetre of rectangle is: "+(2*(length+width)));
    }
}
