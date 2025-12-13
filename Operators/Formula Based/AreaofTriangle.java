import java.util.*;
public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter base and height: ");
        double base=obj.nextDouble();
        double height=obj.nextDouble();
        double area=0.5*(base*height);
        System.out.print("Area of the Triangle is :"+(area));
    }
}
