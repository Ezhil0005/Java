import java.util.*;
public class Sum{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int [] b=new int[a];
        int sum=0;
        for(int i=0;i<a;i++)
        {
            b[i]=obj.nextInt();
            sum+=b[i];
        }
        
           System.out.print("The sum is: "+sum);
        

    }
}