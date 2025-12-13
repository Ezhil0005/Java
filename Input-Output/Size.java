import java.util.Scanner;
public class Size{
    public static void main (String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println(Character.SIZE/8);
        System.out.println(Integer.SIZE/8);
        System.out.println(Float.SIZE/8);
        System.out.println(Double.SIZE/8);
    }
}