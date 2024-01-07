package pack1;
import pack1.First;
public class Second extends First
{

void show2()
{
//System.out.println("private a="+a);
System.out.println("default b="+b);
System.out.println("protected c="+c);
System.out.println("public d="+d);
}
public static void main(String args[])
{
Second s1=new Second();
s1.show2();
}
}
