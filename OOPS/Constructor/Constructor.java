class Constructor
{
    int a,b,c;
    void display()
    {
        System.out.println("a= " +a +" b= "+b);
    }
    Constructor(int a, int b)      //User-Defined Constructor
    {
        this.a=a;            //invoke explicitly
        this.b=b;
        System.out.println("User-Defined Constructor Called");
    }

    Constructor()               //Default Constructor
    {
        a=30;                 //invoke implicitly
        b=20;
	c=40;
        System.out.println("Default Constructor Called");
    }

    {
        System.out.println(" Instance Block Called");
    }

    static
    {
        System.out.println("Static Instance");
    }

    boolean equals(Constructor c)
    {
        if(a==c.a)
            if(b==c.b)
                return true;
        return false;

    }
void m1()
{
  System.out.println(" no argument method Called");
}
void m1(int a)
{
  System.out.println("int argunemt method called");
}
void m1(int a,int b)
{
  System.out.println("int int argunemt method called");
System.out.println(a+b);
}

void m1(int a,float b)
{
  System.out.println("int float argunemt method called");
System.out.println(a-b);
}

void m1(int a,double b)
{
  System.out.println("int float argunemt method called");
System.out.println(a-b);
}
void m1(int a ,int b,int c)
{
  System.out.println("int int int argunemt method called");
System.out.println(a+b+c);
}

}