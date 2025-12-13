
import java.util.*;
public class Calculator
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
        System.out.print("enter two values: ");
        int num1=obj.nextInt();
        int num2=obj.nextInt();
        System.out.print("Enter an operation : ");
        char a=obj.next().charAt(0);

        switch(a)
        {
           case '+':
            System.out.print(num1+num2);
            break;
             case '-':
            System.out.print(num1-num2);
            break;
             case '*':
            System.out.print(num1*num2);
            break;
             case '/':
            System.out.print(num1/num2);
            break;
             case '%':
            System.out.print(num1%num2);
            break;
            default:
                 System.out.print("Invalid Operation");


        }
       
	}
}

