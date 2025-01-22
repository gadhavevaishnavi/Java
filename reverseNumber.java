class reverseNumber
{
int sum=0;
while (n!=0)
{
	sum*=10;
	sum+=n%10;
	n/=10;
}
return sum;
}


class MainClass
{
	public static void main(String args[])
{
Demo d1 = new Demo();
System.out.println(d1.reverseNumber(54321));
}
}
