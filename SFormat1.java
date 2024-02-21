class SFormat1{
	public static void main(String args[])
	{
		System.out.println(args[0]);
		String s1=args[0];		
		System.out.println(args[1]);
		String s2=args[1];
		String s3=String.format("%s%s",s1,s2);
		System.out.println(s3);
		System.out.println(s3.substring(0,2));
								
		
								
	}
}
