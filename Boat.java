import java.util.*;

public class Boat

{
	
public static void main(String[] args)
	
{
	    
int a,b,c,d;
	    
Scanner s=new Scanner(System.in);
	   
 System.out.println("Enter the value of a nd b");
	    
/* a=no.men;
	    b=no.children;*/
	    
a=s.nextInt();
	    
b=s.nextInt();
	    
c=600;
	    
d=a*75+b*30;
	    
if(c>=d)
	    
{
	        
System.out.println("boat can go");
	   
}
	    
else
	    
{
	        
System.out.println("boat will drown");
	    
}
	    
	    
	
}   
	    
	    
	    

}
