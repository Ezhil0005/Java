import java.util.*;
public class MaxLen{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
      int arr[]=new int[a];
      for(int i=0;i<a;i++)
      {
        arr[i]=obj.nextInt();
      }
   System.out.print("sum: ");
     int b=obj.nextInt();
     int sum=0;
     int start=0;
     int maxlen=0;
     for(int end=0;end<a;end++)
     {
      sum+=arr[end];
      while(sum>b)
      {
        sum=sum-arr[start];
        start++;
       
      }
     if(sum==b)
      {
      int len=end-start+1;
      if(maxlen<len)
      {
        maxlen=len;
      }
        
      }
     }
     System.out.println(maxlen);
   
    

}
}