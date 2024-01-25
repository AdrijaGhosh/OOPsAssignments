import java.util.*;
public class average
{
	public static void main(String args[])
	{
	 	Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter length of array");
	 	int len=sc.nextInt();
	 	int arr[]=new int[len];
	 	int sum=0;
	 	System.out.println("Enter "+len +"elements ");
	 	for(int i=0;i<len;i++)
	 	{
	 		arr[i]=sc.nextInt();
	 		sum=sum+arr[i];
	 	}
	 	sum=sum/len;
	 	System.out.println("Average = "+sum);
	}
}
	
