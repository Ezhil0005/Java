import java.util.Scanner;
public class Average
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
        float c = sc.nextFloat();
		System.out.printf("%.2f",(a+b+c)/3);
	}
}
