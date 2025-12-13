import java.util.*;
public class Salaryy {
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double bs=obj.nextDouble();
        System.out.print("Enter Basic hra: ");
        double hra=obj.nextDouble();
        System.out.print("Enter Basic da: ");
        double da=obj.nextDouble();
        double sal=hra+bs+da;
        System.out.print("Salary: "+sal);

    }
}
