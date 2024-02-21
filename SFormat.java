class SFormat{
	public static void main(String args[])
	{
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		String s=args[0];
		String s1=args[1];
		String s2=args[2];
		String s3=args[3];
		String s4=String.format("%s%s%s%s",s,s1,s2,s3);
		System.out.print(s4);						
		
								
	}
}
