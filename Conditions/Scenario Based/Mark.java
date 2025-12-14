import java.util.*;
public class Mark{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter you Mark: ");
        int mark=obj.nextInt();
        if(mark>=35)
        {
            System.out.print("Pass");
        }
       
        else{
            System.out.println("Fail");
        }
       obj.close();

    }
}
