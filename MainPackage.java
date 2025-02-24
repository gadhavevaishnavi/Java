import A.B.C.PackageDemo;

public class MainPackage 
{
    public static void main(String[] args)
 	{
    	   PackageDemo pd = new PackageDemo();
	   pd.a=50;
           pd.display(); 

	   A.B.C.PackageDemo pd1= new A.B.C.PackageDemo();
	   pd1.a=100;
	   pd1.display();
   	 }
}