class ObjCreation
{
 int a,b;
void display()
{
System.out.println("a=" +a+ "b="+b);
}

ObjCreation()
{
System.out.println("Default Constructor");
}

ObjCreation(int a,int b)
{
System.out.println("User-Defined Constructor");
}


{
System.out.println("Instance Block");
}

static
{
System.out.println("Static Block");
}

}