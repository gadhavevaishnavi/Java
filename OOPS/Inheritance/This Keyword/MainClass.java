class MainClass
{
public static void main(String args[])
{
	Demo2 d1 = new Demo2(60);
	d1.display();
	System.out.println(d1); 
	  System.out.println(MainClass.class.getName() + Integer.toHexString(d1.hashCode()));
}

}