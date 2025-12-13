import java.util.*;
public class Candies{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter total candies :");
        int candy=obj.nextInt();
        System.out.print("Enter number of people: ");
        int person =obj.nextInt();
        int b=candy/person;
        System.out.println("Each person gets "+b+" candies");
        System.out.println("remaining candies:"+candy%person);

    }
}