import java.util.Scanner;
class Q15
{
public static void main(String args [] )
{
  Scanner sc=new Scanner(System.in);
  System.out.println(" Enter first No:: ");
  int num1=sc.nextInt();
  System.out.println(" Enter first No:: ");
  int num2=sc.nextInt();
  System.out.println(" Before Swapping no:: ");
  System.out.println(" The first is :: " +num1);
  System.out.println(" The Second is ::" +num2);
  num1=num1-num2;
  num2=num1+num2;
  num1=num2-num1;
  System.out.println(" After Swapping no:: ");
  System.out.println(" The first is :: " +num1);
  System.out.println(" The Second is ::" +num2);
  }
  }