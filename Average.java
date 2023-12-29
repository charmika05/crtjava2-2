import java.util.*;

public class Average
{

public static void main(String[] args) 
	
{
	    
int a,b,c,d;
	    
Scanner s=new Scanner(System.in);
	    
System.out.println("Enter 3 integers");
	    
a=s.nextInt();
	    
b=s.nextInt();
	    
c=s.nextInt();
	    
d=(a+b+c)/3;
	    
System.out.println("average="+d);


//below is float
float e,f,g,h;
System.out.println("Enter 3 float numbers");
	    
e=s.nextFloat();
	    
f=s.nextFloat();
	    
g=s.nextFloat();
	    
h=(Float)(e+f+g)/3;
	    
System.out.println("average="+h);

System.out.printf("%.4f",h);

/* we use this("%.4f",d) to get a particular number
of decimal values */
	
}

}