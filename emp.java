class ee
{
	static String name;
	String dept;
	String ceo;
	void show()
	{
		System.out.println("Name :"+name+" \ndept :"+dept+" \nCEO : "+ceo);
	}
}
class emp
{
	public static void main(String args[])
	{
		ee ob1=new ee();
		ee ob2=new ee();
		ee ob3=new ee();
		ob1.name="Radhika";
		ob1.dept="CSE";
		ob1.ceo="Satyajit II";
		
		ob2.name="ABC XYZ";
		ob2.dept="CSE";
		ob2.ceo="N Modi";
		
		ob3.name="Sachin Tendulkar";
		ob3.dept="ECE";
		ob3.ceo="IEM";
		ob2.show();
		ob1.show();
		ob3.show();
	}
}
