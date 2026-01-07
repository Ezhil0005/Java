import java.util.*;
public class Even{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int [] b=new int[a];
        int sum=0;
        for(int i=0;i<a;i++)
        {
            b[i]=obj.nextInt();
            if(b[i]%2==0)
            {
                sum+=b[i];
            }

        }
        System.out.println("the sum of even numbers is: "+sum);
       
          
        

    }
}