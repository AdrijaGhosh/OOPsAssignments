import java.util.*;
public class SumOfDigits
{
	public static void main(String args[])
	{
	 	Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter a number");
	 	int a=sc.nextInt();
	 	int r;int sum=0;
	 	while(a>0)
	 	{
	 	 	r=a%10;
	 	 	sum=(sum)+r;
	 	 	a=a/10;
	 	}	
	 	System.out.println("Sum of digits = "+sum);
	}
}
	
