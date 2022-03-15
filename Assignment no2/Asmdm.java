import java.util.Scanner;
class Asmdm
{
	public static void main(String args [])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Input First number:");
		int n1 = sc.nextInt();
		
		System.out.println("Input Second number:");
		int n2 = sc.nextInt();
		
		
		int k = n1+n2;
		int j = n1-n2;
		int l = n1*n2;
		int m = n1/n2;
		int n = n1%n2;
		
		System.out.println(" Sum= "+k);
		System.out.println(" sub= "+j);
		System.out.println(" mul= "+l);
		System.out.println(" Div= "+m);
		System.out.println(" mod= "+n);
		}
}