class A_Adr
{
	void show() throws Exception
	{
		Class.forName("Test");
	}
}

class ThrowsKey
{
	public static void main(String args[])
	{
	 	try{
	 		System.out.println("Class found");
	 	}
	 	catch(Exception e)
	 	{
	 		System.out.println(e);
		}
	}
}
