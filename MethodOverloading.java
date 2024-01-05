class First

{	
	   
void show(int a)
	    
{
	        
System.out.println("one arg int method");
	    
}
	    
void show(int a, int b)
	    
{
	        
System.out.println("2 args int method");
	    
}
	    
void show(double a)
	    
{
		    
System.out.println("one arg double method");
	    
}

}

class MethodOverloading

{
    
public static void main(String args[])
	    
{
	        
First f1=new First();
	        
f1.show(23.8);
	        
f1.show(1,2);
	        
f1.show(4);
	   
}

}

