import java.util.*;
public class calculator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter operand 1");
		int a=sc.nextInt();
		System.out.println("Enter operand 2");
		int b=sc.nextInt();
		System.out.println("Enter your choice \n 1-->Addition\n2-->Subtraction\n3-->Multiplication\n4-->Division");
		int ch=sc.nextInt();
		switch(ch)
		{
		 	case 1:
		 	{
		 		int c=a+b;
		 	 	System.out.println("Addition = "+c);
		 	 	break;
		 	}
		 	case 2:
		 	{
		 	 	int c=a-b;
		 	 	System.out.println("Subtraction = "+c);
		 	 	break;
		 	}
		 	case 3:
		 	{
		 	 	int c=a*b;
		 	 	System.out.println("Multiplication = "+c);
		 	 	break;
		 	}
		 	case 4:
		 	{
		 	 	double c=a/b;
		 	 	System.out.println("Division = "+c);
		 	 	break;
		 	}
		 	default:
		 	{
		 		System.out.println("Value not found");
		 	}
		 	
		}
	}
}
