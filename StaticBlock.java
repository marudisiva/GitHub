class StaticBlock
{
	static int a;
	static 
	{
		a=10;
		System.out.println("static block called"+a);
	}
	static void setA(int a)
	{
		a=5;
		System.out.println("static method called"+a);
	}
		public static void main(String ar[])
		{
			System.out.println("main method is calling");
			setA(10);
		}
}