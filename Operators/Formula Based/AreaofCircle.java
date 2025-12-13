import java.util.*;
public class AreaofCircle {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Radius: ");
        double radius=obj.nextDouble();
        double area=3.14*(radius*radius);
        System.out.print("Area of the Circle is :"+(area));
    }
}
