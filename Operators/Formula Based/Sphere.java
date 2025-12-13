import java.util.*;
public class Sphere {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: " );
        int radius=obj.nextInt();
      
        System.out.println("The Surface area of the sphere is: "+(4*3.14*radius*radius));
         System.out.print("The volume of the sphere is: "+((4.0/3.0)*3.14*radius*radius*radius));

    }
}
