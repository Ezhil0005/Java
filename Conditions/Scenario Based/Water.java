import java.util.*;
public class Water{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter litre used ");
        int litre=obj.nextInt();
        double bill=0;
       if(litre<1000)
       {
        bill=0;
       }
       else if((litre>1000)&&(litre<3000))
       {
        bill = (int)(((litre - 1000) / 1000.0) * 5);
       }
       else
        bill=(int)(((2000/1000.0)*5)+((litre-3000)/1000.0*10));
    System.out.println("The bill is :"+bill);
}

}