import java.util.*;
public class reverse
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
	 	 	sum=(sum*10)+r;
	 	 	a=a/10;
	 	}	
	 	System.out.println("Reverse of the number = "+sum);
	}
}
	
