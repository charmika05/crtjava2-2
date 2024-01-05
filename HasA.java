class FirstYear

{
    
void branch()
    
{
        
System.out.println("AI&DS");
    
}
    
void subjects()
    
{
        
System.out.println("la&c, Beee, Physics");
        
    
}
    
void backlogs()
     
    
{
        
System.out.println("la&c"); 
    
}
}


class SecondYear

{
   
void subjects()
    
{
        
FirstYear f1=new FirstYear();
        
f1.branch();
        
f1.backlogs();
        
System.out.println("Java, UHV, co, ads&a");
    
}

}

class HasA

{
	
public static void main(String[] args) 

	
{
	    
SecondYear s1=new SecondYear();
		
s1.subjects();
	
}

}
