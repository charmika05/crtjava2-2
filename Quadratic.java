import java.util.*;

public class Quadratic
{
	
public static void main(String[] args) 
	
{
	    
Scanner s=new Scanner(System.in);
	    
System.out.println("Enter the values of a,b,c ");
	   
int a,b,c;
	    
a=s.nextInt();
	    
b=s.nextInt(); 
	    
c=s.nextInt();
	    
double r1,r2,d;
	    
d=b*b-4*a*c;
	    
if(d<0)
	    
{
	        
System.out.println("Roots are not possible");
	        
	    

}	    
else
	    
{
	    
r1=(-b+Math.sqrt(d))/2*a;
	    
r2=(-b-Math.sqrt(d))/2*a;
	    
System.out.println(r1);
	    
System.out.println(r2);
	    
}
	    
	     
	
}

}
