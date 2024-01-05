class Addition

{
	
	    
void add(int... a)
	    
{
	        
int sum=0;
	        
for(int i=0;i<a.length;i++)
	        
{
	            
sum=sum+a[i];
	        
}
	        
System.out.println(sum);
	    
}
	    

}


class VarArgAddition

{
    
public static void main(String args[])
	    
{
	        
Addition f1=new Addition();
	        
f1.add(45,8);
	        
f1.add();
	        
f1.add(56,8,9,0,7,6);
	        
	   
}

}

