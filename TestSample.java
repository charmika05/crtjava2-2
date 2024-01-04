class Sample3
{
    
int admno;
    
String name;
    
void get(int x,String y)
    
{
        
admno=x;
        
name=y;
        
    
}
    
void show()
    
{
        
System.out.println("Admission no.="+admno+" Name="+name);
    
}

}

class TestSample
{
    

	
public static void main(String[] args) 

	
{
	    
Sample3 s1=new Sample3();
	    
s1.get(111,"xxx");
	    
s1.show();
	    
Sample3 s2=new Sample3();
	    
	    
s2.get(222,"yyy");
	    
s2.show();
	    
	    
		
	
}

}
