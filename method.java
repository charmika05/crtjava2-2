class First

{
	
	    
void show(double... a)
	    
{
	        
System.out.println("vat arg method");
	    
}
	    
void show(double x,double y)
	    
{
	        
System.out.println("two are double method");
	    
}



class VarArg

{
    
public static void main(String args[])
	    
{
	        
First f1=new First();
	        
f1.show(45.6,45.9);
	        
f1.show();
	        
f1.show(56,8,9,0,7,6);
	        
//f1.show(55.5,88.9);
	   
}

}

