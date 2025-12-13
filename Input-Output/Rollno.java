import java.util.Scanner;
public class Rollno{
    public static void main (String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        obj.nextLine();
        String b = obj.nextLine();
        System.out.println("Roll No: "+ a+", "+"Name: "+b);
    }
}