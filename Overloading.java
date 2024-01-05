class First
{
	
	    
void show(float x,float y)
	    
{
	        
System.out.println("two args float method");
	    
}
	    
void show(double c)
	    
{
	        
System.out.println("one arg double method");
	    
}

}

class Second extends First

{
    
	
void add(int a,int b,int c,int d)
	
{
        
System.out.println(a+b+c+d);
	
}

}

class Overloading
{
    
public static void main(String args[])
	    
{
	        
First f1=new First();
	        
f1.show(45.6);
	        
f1.show(34,78);
	        
f1.show(56.6f);
	        
//f1.show(55.5,88.9);
	   
}

}

