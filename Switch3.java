import java.util.*;
public class Switch3

{
	
public static void main(String[] args) 
	
{
	    
Scanner c=new Scanner(System.in);
	    
int a,b,r;
	    
System.out.println("Enter two numbers");
	   
 
a=c.nextInt();
	    
b=c.nextInt();
	    
System.out.println("1.Addition \n2.Subtraction \n3.Multiplication\n4.Division");
	    
System.out.println("Enter your choice");
	    
int ch=c.nextInt();
	    
switch(ch)
	    
{
	        
case 1:
	            
r=a+b;
	            
System.out.println(r);
	            
break;
	        
	       
case 2:
	            
r=a-b;
	            
System.out.println(r);
	            
break; 
	       
case 3:
	            
r=a*b;
	            
System.out.println(r);
	            
break;
	       
case 4:
	            
r=a/b;
	            
System.out.println(r);
	            
break;
	       
default:
	            
System.out.println("invalid");
	       
	    
}
	
}		

}
