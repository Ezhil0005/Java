import java.util.*;
public class AreaofRec {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter length and Breath: ");
        int len=obj.nextInt();
        int bre=obj.nextInt();
        System.out.print("Area of the Rect is :"+(len*bre));
    }
}
