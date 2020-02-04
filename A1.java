class A1
{
	A1()
	{
		System.out.println("A1()");
	}
	A1(int a)
	{
		this();
		System.out.println(a);
	}
	A1(int a,int b)
	{
		this(a);
		System.out.println(b);
	}
public static void main(String ar[])
{
	A1 a=new A1(1,23);
}
}