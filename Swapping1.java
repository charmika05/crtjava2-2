import java.util.*;

public class Swapping1

{
	
public static void main(String[] args)
	
{
	    
int a,b,c;
	    
Scanner s=new Scanner(System.in);
	    
System.out.println("Enter values of a nd b");
	    
a=s.nextInt();
	    
b=s.nextInt();
	    
System.out.println("value of a and b before swapping="+a+"and"+b);
	    
a=a+b;  //a=a*b;
	    
b=a-b;  //b=a/b;
	    
a=a-b;  //a=a//b;
	    
//without using temporary variable
	    
System.out.println("Values of a and b aftwr swapping="+a+"and"+b);
	 
	
}
	

}
