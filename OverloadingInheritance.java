class First

{
	
	    
void add(int a, int b)
	    
{
	        
System.out.println(a+b);
	    
}
	    
void add(int a, int b,int c)
	    
{
	        
System.out.println(a+b+c);
	    
}

}


class Second extends First

{
    
	
void add(int a,int b,int c,int d)
	
{
        
System.out.println(a+b+c+d);
	
}
}

class OverloadingInheritance

{
    
public static void main(String args[])
	    
{
	        
Second f1=new Second();
	        
f1.add(23,7,9,8);
	        
f1.add(1,6,2);
	        
f1.add(4,9);
	   
}

}

