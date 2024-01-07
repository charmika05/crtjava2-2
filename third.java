package pack1;
import pack1.First;
public class Third 
{

void show3()
{
First f1=new First();
//System.out.println("private a="+f1.a);
System.out.println("default b="+f1.b);
System.out.println("protected c="+f1.c);
System.out.println("public d="+f1.d);
}
public static void main(String args[])
{
Third t1=new Third();
t1.show3();
}
}
