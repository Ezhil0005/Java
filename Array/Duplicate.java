import java.util.*;
public class Duplicate{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int [] b=new int[a];
       
        for(int i=0;i<a;i++)
        {
            b[i]=obj.nextInt();
           
        }
        int count=0;
        
        for( int i=0;i<a;i++)
        {
            for(int j=i+1;j<a;j++)
            {
            if(b[i]==b[j])
                count++;
            }
            
       
        }
         if(count>0)
            System.out.println("yes");
        else
            System.out.println("No");
      
       
          
        

    }
}