import java.util.*;
public class Cylinder {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the radius and height of the Cylinder: " );
        double radius=obj.nextDouble();
        double height=obj.nextDouble();
        System.out.printf("The Surface area of the Cylinder is: "+"%.2f\n", (2*Math.PI*radius*(radius+height)));
         System.out.printf("The volume of the Cylinder is: "+"%.2f", (Math.PI*(radius*radius)*height));

    }
}
