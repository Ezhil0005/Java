import java.util.*;
public class Cuboid {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter length,breath and height of the cuboid: " );
        int len=obj.nextInt();
        int bre=obj.nextInt();
        int hei=obj.nextInt();
        System.out.printf("The Surface are of the cuboid is: "+(2*((len*bre)+(bre*hei)+(len*hei))));
         System.out.printf("The volume of the cuboid is: "+((len*bre*hei)));

    }
}
