import java.util.*;
public class cube {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Edge of the cube: " );
        int a=obj.nextInt();
        System.out.println("The Perimetre of the cube is: "+(12*a));
        System.out.println("The volume of the cube is: "+(a*a*a));
        System.out.println("The surface area of the cube is: "+6*(a*a));
    }
}
