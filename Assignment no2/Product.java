import java.util.Scanner;
class Product
{
	public static void main(String args [])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number1:");
		int n1 = sc.nextInt();
		
		System.out.println("Enter Second number2:");
		int n2 = sc.nextInt();
		
		int k = n1*n2;
		System.out.println(" Product = "+k);
		
	}
}