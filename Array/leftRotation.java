import java.util.*;
public class leftRotation{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
      int arr[]=new int[a];
      for(int i=0;i<a;i++)
      {
        arr[i]=obj.nextInt();
      }
   System.out.print("enter the rotate: ");
     int b=obj.nextInt();
     b=b%a;
      int k=0;
      int j=a-1;
      while(k<j)
      {
        int temp=arr[k];
        arr[k]=arr[j];
        arr[j]=temp;
        k++;
        j--;
      }
      for(int i=0;i<a;i++)
      {
        System.out.print(arr[i]+" ");
      }
      int x=0;
      int y=a-b-1;
      while(x<y)
      {
        int temp1=arr[y];
        arr[y]=arr[x];
        arr[x]=temp1;
        x++;
        y--;

      }
      System.out.println();
      for(int i=0;i<a;i++)
      {
        System.out.print(arr[i]+" ");
      }
      int s=a-b;
      int v=a-1;
      while(s<v)
      {
        int temp2=arr[v];
        arr[v]=arr[s];
        arr[s]=temp2;
        s++;
        v--;
      }
      System.out.println();
      for(int i=0;i<a;i++)
      {
        System.out.print(arr[i]+" ");
      }

}
}