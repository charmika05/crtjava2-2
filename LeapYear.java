import java.util.*;

public class LeapYear
{
	
public static void main(String[] args) 
	

}	    
Scanner s=new Scanner(System.in);
	    
System.out.println("Enter the number ");
	   
int a;
	    
a=s.nextInt();
	    
if(a%4==0 && (a%100!=0 || a%400==0))           
	        
{
	            
System.out.println("leap year");
	        
}
	        
else
	        
{
	           
System.out.println("non leap year"); 
	        
}
}
}
	   