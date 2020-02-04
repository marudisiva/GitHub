class Obj
{
	static int count=0;
	Obj()
	{
		count++;
	}
		public static void main(String ar[])
		{
			Obj o=new Obj();
			System.out.println(count);
			Obj o1=new Obj();
			System.out.println(count);
		}
}