class Demo1
{
	int a=10;
	void display()
	{
		int a=1000;
		System.out.println("a="+a);
	}
	Demo1()
	{
	System.out.println("Default constructor of Demo1");
	}

	Demo1(int a)
	{
	this();
	System.out.println("User-defined constructor of Demo1");
	}
}