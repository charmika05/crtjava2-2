import java.util.*;

public class NestedIf

{
	
public static void main(String[] args) 

{
	    
Scanner s=new Scanner(System.in);
	    
System.out.println("Enter the numbers that need to be compared ");
	    
int a,b,c;
	    
a=s.nextInt();
	    
b=s.nextInt();
	    
c=s.nextInt();
	    
if(a>b)
	    
{
	        
if(a>c)
	        
{
	            
System.out.println(a+" is the biggest");
	            
	        
}
	        
else
	        
{
	            
System.out.println(b+" is tyhe biggest");
	        
}
	   
}
	    
else
	    
if(b>c)
	            
{
	                
System.out.println(b+" is the biggest");
	                
	            
}
	            
else
	            
{
	                
System.out.println(c+" is the biggest");
	           
}

}
}	    