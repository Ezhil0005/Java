import java.util.*;
public class Word
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("Enter a number :");
         long a=obj.nextLong();
        long temp =a;
        int rev=0;
        while(temp>0)
        {
          rev=(rev*10)+(int)temp%10;
          temp/=10;
        }
        while(rev>0)
        {
            int z =rev % 10;
             switch(z)
             {
        case 0: System.out.print("Zero "); break;
        case 1: System.out.print("One "); break;
        case 2: System.out.print("Two "); break;
        case 3: System.out.print("Three "); break;
        case 4: System.out.print("Four "); break;
        case 5: System.out.print("Five "); break;
        case 6: System.out.print("Six "); break;
        case 7: System.out.print("Seven "); break;
        case 8: System.out.print("Eight "); break;
        case 9: System.out.print("Nine "); break;
    }
    rev/=10;
        }
       

    }
      
}