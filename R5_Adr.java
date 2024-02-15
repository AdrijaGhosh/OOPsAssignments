 import java.util.*;
 class R5_Adr
 {
 	int rollno,marks;
 	char grade;
 	String name;
 	R5_Adr()
 	{
 		rollno=0;
 		marks=0;
 		name="";
 		
 	}
 	public void calculateMarks()
 	{
 		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter name..");
 		name=sc.nextLine();
 		System.out.println("Enter roll no..");
 		rollno=sc.nextInt();
 		System.out.println("Enter marks..");
 		marks=sc.nextInt();
		if(marks>=90)
		{
		 grade='A';
		 System.out.println("Grade = "+grade);
		} 
		else if(marks>=80 && marks<90)
		{
		 grade='B';
		 System.out.println("Grade = "+grade);
		} 
		else if(marks>=70 && marks<80)
		{
		 grade='C';
		 System.out.println("Grade = "+grade);
		} 
		else if(marks>=60 && marks<70)
		{
		 grade='D';
		 System.out.println("Grade = "+grade);
		} 
		else
		{
		  grade='F';
		 System.out.println("Grade = "+grade);	
		}
				
 	}
 	public static void main(String args[])
 	{
 		Student obj=new Student();
 		obj.calculateMarks();
 	}
 }
