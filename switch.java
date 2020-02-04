import java.util.*;
class Calendar
{
public static void main(String ar[])
{
int c;
Scanner s=new Scanner(System.in);
c=s.nextInt();
switch(c)
{
case 1:System.out.println("monday\n");
break;
case 2:System.out.println("tuesday\n");
break;
case 3:System.out.println("wednesday\n");
break;
case 4:System.out.println("thursday\n");
break;
case 5:System.out.println("friday\n");
break;
case 6:System.out.println("saturday\n");
break;
case 7:System.out.println("sunday\n");
break;
case 8:System.out.println("invalid\n");
break;
}
}
}