class Box
{	
	int length,width,height;
	public Box()
	{
		int lenght=3;
		int width=9;
		int height=8;
	}
	public Box(int length,int width,int height)
	{
		this.length=length;
		this.width=width;
		this.height=height;
	}
	void setBox(int length1,int width1,int height1)
	{
		length=length1;
		width=width1;
		height=height1;
	}
	void getBox()
	{
		System.out.println("length"+length+"width"+width+"height"+height);
		System.out.println("volume"+(length*width*height));
	}
public static void main(String ar[])
{
Box b=new Box();
b.setBox(3,9,8);
b.getBox();
}
}