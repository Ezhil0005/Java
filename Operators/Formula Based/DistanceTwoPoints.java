import java.util.*;
public class DistanceTwoPoints {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter x1,y1,x2,y2: ");
        double x1=obj.nextDouble();
        double y1=obj.nextDouble();
        double x2=obj.nextDouble();
        double y2=obj.nextDouble();
        double distance=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.printf("The Distance between Two Points is :"+ "%.4f",(distance));
    }
}
