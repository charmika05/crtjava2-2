class ConstructorWithArgs

{
    
int admno;
    
String name;
    
ConstructorWithArgs(int x,String y)
    
{
        
admno=x;
        
name=y;
    
}
    
void show()
    
{
        
System.out.println("Admission no.:"+admno+" Name:"+name);
        
    
}
    
    
	
public static void main(String[] args) 
	
{
	    
		 
ConstructorWithArgs s1=new ConstructorWithArgs(2543,"xxx");
		 
s1.show();
		
		
	
}

}
