import java.util.*;
public class UptoLow
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("enter a upercase character: ");
        char a=obj.next().charAt(0);
        int ascii=(int) a;
        int c=ascii+32;
        char low=(char)c;
        System.out.println("The lowercase is :"+low);

}

}