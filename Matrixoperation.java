import java.util.*;

class public Matrix
{
	
	
	int [][]matrix1;
	int [][]matrix2;
	int [][]matrix3;

	int row ,col;
	Scanner sc=new Scanner(System.in);
	System.out.println("\nEnter row:");
	row=sc.nextInt();
	System.out.println("\nEnter Col:");
	col=sc.nextInt();
	
	matrix1=new int[row][col];
	matrix2=new int[row][col];
	matrix3=new int[row][col];
	
	System.out.println("\nEnter matrix1 element:");
	for(int r=0;r<row;++r)
	{
		for(int c=0;c<col;++c)
		{
			matrix1[r][c]=sc.nextInt();
		}
	}
	System.out.println("\nprint matrix1 element :");
	for(int r=0;r<row;++r)
	{
		for(int c=0;c<col;++c)
		{
			System.out.print("\t"+matrix1[r][c]);
		}
		System.out.println("\n");
	}
	
	for(int r=0;r<row;++r)
	{
		for(int c=0;c<col;++c)
		{
			System.out.print("\t"+matrix1[r][c]);
		}
		System.out.println("\n");
	}

	System.out.println("\nEnter matrix2 element:");
	for(int r=0;r<row;++r)
	{
		for(int c=0;c<col;++c)
		{
			matrix2[r][c]=sc.nextInt();
		}
	}
	System.out.println("\nprint matrix2 element :");

	public void AddMatrix()
	{

	for(int r=0;r<row;++r)
	{
		for(int c=0;c<col;++c)
		{
			matrix3[r][c]=matrix1[r][c]+matrix2[r][c];
		}
	}
	System.out.println("\nprint addition matrix1 and matrix2 element:");
	for(int r=0;r<row;++r)
	{
		for(int c=0;c<col;++c)
		{
			System.out.print("\t"+ (matrix3[r][c]));
		}
		System.out.println("\n");
	}
	}
	
}
class Matrixop
{
	public static void main(String[] args)
	{
		Matrix M;
		M= new Matrix();
		M.AddMatrix();
	}
}