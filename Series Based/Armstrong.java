import java.util.*;
public class Armstrong{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int count=0;
        for(int i=1;i<=a;i++)
        {
            int temp=i;
            int temp1=i;
            count=0;
            while(temp>0)
            {
            int b=temp%10;
            count++;
            temp/=10;
            }
            int sum=0;
            while(temp1>0)
            {
                int c=temp1%10;
                sum+=Math.pow(c,count);
                temp1/=10;
            }
            if(sum==i)
            {
                System.out.print(i+" ");
            }
        }
    }
}