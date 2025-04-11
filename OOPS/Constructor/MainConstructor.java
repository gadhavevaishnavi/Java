class MainConstructor
{
    public static void main(String args[])
    {
       Constructor c =new Constructor(20,30);
        Constructor c1 = new Constructor();

        c.display();                        //user-defined
        c1.display();                        //default
        System.out.println(c.hashCode());
        System.out.println(c1.hashCode());
        System.out.println(c.equals(c1));    // compare value - need to override
        System.out.println(c==c1);           // compare memory
        c.m1();                 // no arg
        c1.m1();               // no arg
        c.m1(10);             //int

        c1.m1(10,20,30);    //int int
        c.m1(10,20,30);

        c1.display();

        c.m1(60,50);     //int int
        c1.display();
	
        c.m1(60,50.0f);       //int float
	 c.m1(60,50.0);       // int double
        c1.display();

        c.m1(60,50);      //int int


    }
}