import java.util.*;
public class BytesToBits{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter byte:");
        int a=obj.nextInt();
        System.out.println(a + " bytes is equal to "+ a*8 +" bits");
    }
}