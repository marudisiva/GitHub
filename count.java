class A
{
int a;
double d;
char ch='z';
float f;
static int count=0;
A()
{
count++;
}
public static void main(String ar[])
{
A a1=new A();
A a2=new A();
System.out.println(count+""+a1.a+""+a2.d+""+a2.ch+""+a1.f);
}
}