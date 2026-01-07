import java.util.*;
public class NegToZero{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int [] b=new int[a];
        int count=0;
        for(int i=0;i<a;i++)
        {
            b[i]=obj.nextInt();
           
        }
        int k=0;
        for(int i=0;i<a;i++)
        {
            if(b[i]<0)
            {
               b[i]=0;

        
            }
        }
       
        for(int i=0;i<a;i++)
        {
            System.out.print(b[i]+" ");
          
        }
      
       
          
        

    }
}