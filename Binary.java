package akash;
import java.util.*;
public class Binary {
	
	public static void main(String args[])
	{  
	int a[]=new int[10];;
	int n, i;    
	Scanner sd= new Scanner(System.in);
	
	System.out.println("Enter the number to convert: ");    
	n=sd.nextInt();    
	for(i=0; n>0; i++)    
	{    
	a[i]=n%2;    
	n= n/2;  
	}    
	sd.close();
	System.out.println("Binary of the given number= ");    
	for(i=i-1 ;i>=0 ;i--)    
	{    
	System.out.print(a[i]);    
	}    
	}  
	
	
	

}
