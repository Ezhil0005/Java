import java.util.Scanner;
public class Dis {
   public static void main(String[]args) 
   {
    Scanner obj= new Scanner(System.in);
    int ori_pri=obj.nextInt();
    int dis=obj.nextInt();
    int dis_pri=(ori_pri*dis/100);
    System.out.println(ori_pri-dis_pri);


   }
}
