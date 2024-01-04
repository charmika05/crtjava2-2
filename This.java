class This

{
    
int admno;
    
String name;
    
    
void get(int admno, String name)
        
{
            
this.admno=admno;
            
this.name=name;
        
}
    
    
void show()
    
{
        
System.out.println("Admission no.:"+admno+" Name:"+name);
        
    
}
    
    
	
public static void main(String[] args) 

	
{
	    
		
This s1=new This();
		 
s1.get(2345,"rrr");
		 
s1.show();
		
		
	
}

}
