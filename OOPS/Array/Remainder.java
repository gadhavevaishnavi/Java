
//RSL
class Remainder
{
void function(int a[])
{
for(int i=0;i<a.length;i++)
 	{
		if(a[i]%5==4)
			System.out.println(a[i]);
	}
}
public static void main(String args[])
{
	int a[]= {10,19,20,30,40,50};
	int b[]= {19,10,44,3,11,129};
	Remainder r=new Remainder();
	r.function(a);
	r.function(b);
   }
}