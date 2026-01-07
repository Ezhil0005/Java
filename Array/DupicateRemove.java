import java.util.*;
public class DupicateRemove{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
      int []arr=new int[a];
     
      for(int i=0;i<a;i++)
      {
        arr[i]=obj.nextInt();
      }
      int temp=a;
      for(int i=0;i<temp;i++)
      {
        for(int j=i+1;j<temp;j++)
        {
          if(arr[i]==arr[j])
            {
              for(int k=j;k<temp-1;k++)
              {
              arr[k]=arr[k+1];
              }
              temp--;
              j--;

            }
          
        }
      }
     for(int i=0;i<temp;i++)
     {
       System.out.print(arr[i]+" ");
     
     }
      }
    }
