class Static

{
    
void m1()
    
{
        
System.out.println("instance method");
    
}
    
static void m2()
   
{
        
System.out.println("static method");
    
}
    
    
	
public static void main(String[] args) 
	
{
	    
		 
//Static.m1();
		 
Static.m2();
		 
Static s1=new Static();
		 
s1.m1();
		 
s1.m2();
		
	
}

}
