import java.util.*;

public class MnMatrix

{
	
public static void main(String[] args) 
	
{
		
int a[][],i,j,m,n;
		 
Scanner s=new Scanner(System.in);
		 
System.out.println("Enter no.of rows nd columns");
		
 m=s.nextInt();
		 
n=s.nextInt();
		 
a=new int[m][n];
		 
System.out.println("Enter elements");
		 
for(i=0;i<m;i++)
		 
{
		     
for(j=0;j<n;j++)
		     
{
		         
a[i][j]=s.nextInt();
		     
}
		 
}
		  
System.out.println("Matrix is:");
		 
for(i=0;i<m;i++)
		 
{
		     
for(j=0;j<n;j++)
		     
{
		         
System.out.print(a[i][j]+" ");
		     
}  
		      
System.out.println();
		 
}
	
}

}
		 
		 
		 
	