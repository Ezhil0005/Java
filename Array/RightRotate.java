import java.util.*;
public class RightRotate{
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
      int t=0;
      int v=b-1;
      while(t<v)
      {
        int temp1=arr[t];
        arr[t]=arr[v];
        arr[v]=temp1;
        t++;
        v--;

      }
      int x=b;
      int y=a-1;
      while(x<y)
      {
        int temp2=arr[y];
        arr[y]=arr[x];
        arr[x]=temp2;
        x++;
        y--;
      }
       System.out.println();
      for(int i=0;i<a;i++)
      {
        System.out.print(arr[i]+" ");
      }

}
}