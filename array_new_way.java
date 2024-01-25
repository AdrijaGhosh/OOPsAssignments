import java.util.*;
public class array_new_way
{
	public static void main(String args[])
	{
		int myarray[]={1,2,3,4,5};
		int index;
		for(index=0;index<5;index++)
		{
			System.out.println(myarray[index]);
		}
		System.out.println("Printing by new method..");
		for(int ele:myarray)
		{
			System.out.println(ele);
		}
	}
}
	
