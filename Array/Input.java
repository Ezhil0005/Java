import java.util.*;
public class Input{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int [] b=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=obj.nextInt();
        }
         for(int i=0;i<a;i++)
        {
           System.out.print(b[i]+" ");
        }

    }
}