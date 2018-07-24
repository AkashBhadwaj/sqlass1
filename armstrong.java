import java.util.*;

class armstrong
{

	public static void main(String args[])
	{

		int ch;
		int num,count=0,rem,sum=1,sum1=0;
		Scanner sd= new Scanner(System.in);
		System.out.println("Enter the number");
		ch=sd.nextInt();
		num=ch;
	
		while(num>0)
		{
			num=num/10;
			count++;
			
		}

		num=ch;
		while(num>0)
		{
		
			rem=num%10;
			for(int i=1;i<=count;i++)
			{
			sum=sum*rem;
			}
			sum1=sum1+sum;
			sum=1;
			num=num/10;
		}
		if(sum1==ch)
			System.out.println("it is a armstrong");
		else

			System.out.println("it is not armstrong");
	}
}