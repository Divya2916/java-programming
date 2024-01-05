
import java.util.Scanner;
class Sum
{
	public static void main(String[] args)//function
	{
		System.out.println("taking input from the user");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number 1");
		int a = sc.nextInt();
		System.out.println("enter number 2");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("the sum of the number is");
		System.out.println(sum);
	}
}