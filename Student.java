import java.util.Scanner;
class Student
{
	public static void main(String[] args)
	{
	System.out.println("Enter 5 subjects mark");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter science subject marks");
	Float a = sc.nextFloat();
	System.out.println("Enter maths subject marks");
	Float b = sc.nextFloat();
	System.out.println("Enter english subject marks");
	Float c = sc.nextFloat();
	System.out.println("Enter history subject marks");
	Float d = sc.nextFloat();
	System.out.println("Enter chemistry subject marks");
	Float e = sc.nextFloat();
	System.out.println("Enter dg subject marks");
	Float f = sc.nextFloat();
	double total = a+b+c+d+e+f;
	//double average = (total / 5.0);
	double percentage = (total / 600.0)*100;

	System.out.println("Total marks ="+total);
	//System.out.println("average marks ="+average);
	System.out.println("percentage ="+percentage);
}
}



	
		