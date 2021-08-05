package Assignments;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          int ch;
          while(true) {
        	  System.out.println(" ");
        	  System.out.println("enter first value");
               int a=sc.nextInt();
               System.out.println("enter second value");
               int b=sc.nextInt();
        	  System.out.println("1.Addition");
        	  System.out.println("2.Substraction");
        	  System.out.println("3.Multiplication");
        	  System.out.println("4.Division");
        	  System.out.println("5.Exit");
        	  System.out.println("enter your choice");
        	  ch=sc.nextInt();
        	  switch(ch) 
        	  {
        	  case 1: add(a, b);
        	          break;
        	  case 2: Sub(a, b);
	                  break;
        	  case 3: Mul(a, b);
	                  break;
        	  case 4: Div(a, b);
	                  break;
        	  case 5: System.exit(1);
        	          sc.close();
        	          break;
        	  default:System.out.println("Please Select from above options");        
        	  }
          }          
	}

	private static void Div(int a, int b) {
		int c=0;
		c=a/b;
		System.out.println("--------------------------");
		System.out.println("The Division is  "+c);
		
	}	

	private static void Mul(int a, int b) {
		int c=0;
		c=a*b;
		System.out.println("--------------------------");
		System.out.println("The Multiplication is  "+c);
		System.out.println("--------------------------");
		
	}

	private static void Sub(int a, int b) {
		int c=0;
		c=a-b;
		System.out.println("--------------------------");
		System.out.println("The Substraction is  "+c);
		System.out.println("--------------------------");
	}

	private static void add(int a, int b) {
		int c=0;
		c=a+b;
		System.out.println("--------------------------");
		System.out.println("The addition is  "+c);
		System.out.println("--------------------------");
	}
	
}
