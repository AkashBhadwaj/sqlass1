import java.util.*;

class Shape
{
	private int height,length,radius;
		double sum;
	public double circle(int a)
	{
	radius=a;
	sum=3.14*radius*radius;	
	return sum;
	}

	public double triangle(int a,int b)
	{
		length=a;
		height=b;	
		sum=0.5*length*height;
		//num3=num1*num1*num1;
		return sum;
	}
	
	public double rectangle(int a,int b)
	{
		int b1=b;
		length=a;
		sum=length*b1;	
		return sum;

	}
	
	public void display(double a)
	{
			double num3=a;
		System.out.println("Result is:"+num3);
	}

		public static void main(String args[])
		{

			Scanner sd=new Scanner(System.in);
			Shape ss=new Shape();
			int ch,input1,input2;
			char cv;
		do{
			System.out.println("MENU");
			System.out.println("1.cube"+"\n2.rectangle"+"\n3.triangle");
			ch=sd.nextInt();
			switch(ch)
			{

			case 1: System.out.println("Circle\n");
				System.out.println("Enter the radius\n");
				input1=sd.nextInt();			
				//ss.input(input1);
				double gg=ss.circle(input1);
				ss.display(gg);
				break;

			case 2: System.out.println("Rectangle\n");
				//ss.input();
				System.out.println("Enter the length\n");
				input1=sd.nextInt();	
				input2=sd.nextInt();		
				//ss.input(input1);
				double gh=ss.rectangle(input1,input2);
				//int gh=ss.square();
				ss.display(gh);
				break;
			case 3: System.out.println("Triangle\n");
				//ss.input();
				//Scanner sd=new Scanner(System.in);
				System.out.println("Enter the height & length\n");
				input1=sd.nextInt();
				input2=sd.nextInt();
				//System.out.println("Enter the power\n");
				//int ab=sd.nextInt();	
				double gb=ss.triangle(input1,input2);
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