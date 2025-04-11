class Demo2 extends Demo1
{
	int a=20;
	void display()
	{
		int a=2000;
		System.out.println(this);
		//System.out.println("a="+this.a);
		super.display();
	}
	Demo2()
	{
	this(50);
	System.out.println("Default constructor of Demo2");
	}

	Demo2(int a)
	{
	super(30);
	System.out.println("User-defined constructor of Demo2");
	}
}