import java.util.*;

class prime
{

	public static void main(String args[])
	{

		int ch;
		int num,num2=0;
		Scanner sd= new Scanner(System.in);
		System.out.println("Enter the number");
		ch=sd.nextInt();
		num=(ch/2);
		for(int i=2;i<=num;i++)		
{
		if(num%i==0)
	{
		System.out.println("it is not a prime number");
		num2=1;
		break;
	}		
}
	

if(num2==0)
{
		System.out.println("it is prime number");

}


	}


}