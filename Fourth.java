package pack2;
import pack1.First;
public class Fourth extends First
{

void show4()
{
//System.out.println("private a="+a);
//System.out.println("default b="+b)'
System.out.println("protected c="+c);
System.out.println("public d="+d);
}
public static void main(String args[])
{
Fourth s1=new Fourth();
s1.show4();
}
}
