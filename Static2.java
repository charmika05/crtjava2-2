class Static2

{
    
int a=10;
    
static int b=20;
    
void m1()
    
{
        
System.out.println("a="+a+" b="+b);
    
}
    
static void m2()
    
{
        
Static2 s=new Static2();
        
System.out.println("a="+s.a+" b="+b);
    
}
    
    
	
public static void main(String[] args) 
	
{
	    
		 
		 
		 
Static2 s1=new Static2();
		 
s1.m1();
		
s1.m2();
		
	


}
}
