import java.util.*;
/*class Number
{
public static void main(String ar[])
{
int n,i,j;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{ 
System.out.print(j);
}
System.out.println("\n");
}
}
}*/

/*class Number
{
public static void main(String ar[])
{
int i=1;
while(i<=5)
{
int j=1;
while(j<=5)
{
if(i>=j)
{
System.out.print(j);
}
j++;
}
System.out.println();
i++;
}
}
}*/

/*class Number
{
int stuId;
String stuName;
String stuBranch;
int stuFee;
 void StudentClass(int id,String branch,String name,int fee)
{
stuId=id;
stuBranch=branch;
stuName=name;
stuFee=fee;
}
void getNumber()
{
System.out.println("stuId"+stuId+"stuBranch"+stuBranch+"stuName"+stuNname+"stuFee"+stuFee);
}
public static void main(String ar[])
{
Number a=new Number();
a.setNumber(123,"cse","abc",1000);
a.getNumber();
}
}*/

/*class A
{
 static int n;
int fact(int id)
{
n=1;
for(int i=1;i<=id;i++)
{
n=n*i;
}
return n;
}
public static void main(String ar[])
{
A a=new A();
a.fact(5);
System.out.println(n);
}
}*/

/*class A
{
int fact(int n)
{
while(n!=0)
return(n*fact(n-1))
}
public static void main(String ar[])
{
int i,f=1;
int num=5;
f=fact(num);
System.out.println(f);
}
}*/

/*import java.util.*;
class A
{
int Calc(int a,int b)
{
int c;
Scanner s=new Scanner(System.in);
c=s.nextInt();
switch(c)
{
case 1: c=a+b;
System.out.println(c);
break;
case 2: c=a-b;
System.out.println(c);
break;
case 3: c=a*b;
System.out.println(c);
break;
case 4: c=a/b;
System.out.println(c);
break;
default:System.out.println("enter a valid number");
}
return c;
}
public static void main(String ar[])
{
A a=new A();
a.Calc(3,4);
}
}*/

/*class A
{
static int add(int a,int b)
{
return a+b;
}
static int sub(int a,int b)
{
return a-b;
}
static int mul(int a,int b)
{
return a*b;
}
static int div(int a,int b)
{
return a/b;
}
public static void main(String ar[])
{
int c;
Scanner s=new Scanner(System.in);
c=s.nextInt();
A a=new A();
switch(c)
{
case 1:c=a.add(1,2);
System.out.println(c);
break;
case 2:c=a.sub(1,2);
System.out.println(c);
break;
case 3:c=a.mul(1,2);
System.out.println(c);
break;
case 4:c=a.div(1,2);
System.out.println(c);
break;
}
}
}*/


class A
{
int l;
int b;
double h;
void setBox(int len,int bred,double hgt)
{
l=len;
b=bred;
h=hgt;
}
void getA()
{
System.out.println("result"+(l*b*h));
}
public static void main(String ar[])
{
A a=new A();
a.setBox(1,2,4.5);
a.getA();
}
}


//arrays//


class ArrayExample
{
public static void main(String ar[])
{
int arr[]={12,15,10,13};
int []arr1={1,9,4,2};
//print array
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
//foreach loop
for(int i:arr)
{
System.out.println(arr[i]);
}
}
}

//min and max from array?//

/*class Abc
{
public static void main(String ar[])
{
int arr[]={4,8,1,7,2};
int min=arr[0];
int max=arr[0];
for(int i=0;i<arr.length;i++)
{
if(min>arr[i])
{
min=arr[i];
}
if(max<arr[i])
{
max=arr[i];
}
}
System.out.println(min);
System.out.println(max);
}
}*/

//ascending and descending order//

/*class Asd
{
public static void main(String ar[])
{
int arr[]={2,9,4,1,0};
int temp=0;
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
System.out.println(arr[i]);
}
else
{
}
if(arr[i]<arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
System.out.println(arr[i]);
}
else
{
}
}
}*/

//sum and avaerage//

class Avg
{
public static void main(String ar[])
{
int arr[]={2,9,5,3};
int s1=0;
for(int i=0;i<arr.length;i++)
{
s1=s1+arr[i];
}
System.out.println(s1);
int a=0;
a=s1/arr.length;
System.out.println(a);
}
}

//matrix mul//

class Mul
{
public static void main(String ar[])
{
int a[][];
int b[][];
int c[][];
Scanner s=new Scanner(System.in);
a[][]=s.nextInt();
b[][]=s.nextInt();
m=s.nextInt();
n=s.nextInt();
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.println(a[i][j]);
}
}
for(int j=0;i<m;j++)
{
for(int k=0;k<n;k++)
{
System.out.println(b[j][k]);
}
}
for(int i=0;i<m;j++)
{
for(int k=0;k<n;k++)
{
c[][]=a[i]*b[k]+a[i+1]*b[k+1];
System.out.println(c[i][j]);
}
}
}
}