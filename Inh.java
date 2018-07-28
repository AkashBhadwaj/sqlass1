class Parent
{

	public int valu1,valu2;
	public void display()
		{
				System.out.println("parent1");


		}

	//Parent()
	//	{
	//		valu1=0;
	//		valu2=0;
	//			System.out.println("ConstructorP");
	//	}


		Parent(int c)
		{
			valu1=c;
			
				System.out.println("Constructorps"+valu1);
		}


		Parent(int c,int d)
		{
			valu1=c;
			valu2=d;
			
				System.out.println("Constructorps"+valu1);
		}
}



class Inh extends Parent
{

	public int valu1,valu2;
	public void display()
	{

			System.out.println("child1");

	}
	
Inh(int e,int h )
		{
			super(e);	
			valu1=3;
			valu2=4;

			System.out.println("ConstructorC");
		}
	public static void main(String args[])

	{

		//Inh a1=new Inh();

		Inh a1=new Inh(45,55);

		//a1.display();
				



	}


}