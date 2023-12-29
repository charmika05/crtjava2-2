import java.util.*;

public class Character
{
	
public static void main(String[] args) 
	
{
	    
Scanner s=new Scanner(System.in);
	    
System.out.println("Enter the Character ");
	    
char a;
	    
a=s.next().charAt(0);
	   
if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'|| a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
	    
{
	        
System.out.println("vowel");
	        
	    
}
	    
else
	   
{
	      
System.out.println("consonant");
	    
}

	
}

}