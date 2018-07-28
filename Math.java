import java.util.*;

class Math
{
	private int num1,num2,num3;
	public int square()
	{
	
	num3=num1*num1;
	return num3;

	}

	public int cube()
	{

		num3=num1*num1*num1;
		return num3;
	}
	
	public int power(int a,int b)
	{

		num1=a;
		num3=1;
		for(int i=1;i<=b;i++)
		{
		num3=num3*num1;	
		}
		
		return num3;

	}
	

	public void input()
	{
		Scanner sd=new Scanner(System.in);
		System.out.println("Enter the number\n");
		num1=sd.nextInt();		
	}
	public void display(int a)
	{
			num3=a;
		System.out.println("Result is:"+num3);
	}

		public static void main(String args[])
		{

			Scanner sd=new Scanner(System.in);
			Math ss=new Math();
			int ch;
			char cv;
		do{
			System.out.println("MENU");
			System.out.println("1.cube"+"\n2.square"+"\n3.power");
			ch=sd.nextInt();
			switch(ch)
			{

			case 1: System.out.println("CUBE\n");
				ss.input();
				int gg=ss.cube();
				ss.display(gg);
				break;

			case 2: System.out.println("SQUARE\n");
				ss.input();
				int gh=ss.square();
				ss.display(gh);
				break;
			case 3: System.out.println("POWER\n");
				//ss.input();
				//Scanner sd=new Scanner(System.in);
				System.out.println("Enter the number\n");
				int aa=sd.nextInt();
				System.out.println("Enter the power\n");
				int ab=sd.nextInt();	
				int gb=ss.power(aa,ab);
				ss.display(gb);
				break;
			//case 4: Exit(0);
		       default: System.out.println("Wrong Option");

			}
				System.out.println("Do u want to do again!!!!");
				 cv=sd.next().charAt(0);
		}while(cv=='Y'||cv=='y');


		}


}