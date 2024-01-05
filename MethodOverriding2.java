class Parent

{
	
	    
void surname()
	    
{
	       
	        
System.out.println("RR");
	    
}
	        
void designation()
	    
{
	       
System.out.println("clerk");
	    
}
	    

}

class Child extends Parent
{
    
void designation()
   
{ 
        
System.out.println("java programmer");
    
}

}


class MethodOverriding2

{
    
public static void main(String args[])
	    
{
	        
Child c1=new Child();
	        
c1.surname();
	        
c1.designation();
	    
}

}

