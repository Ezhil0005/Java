import java.util.*;
public class Data{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter data used ");
        int data=obj.nextInt();
        String res="";
       if((data<50))
       {
        res="low data";
       }
       else if((data>50)&&(data<100))
       {
        res = "half consumed";
       }
       else
       {
        res="fully consumed";
       }
       System.out.println(res);
}

}