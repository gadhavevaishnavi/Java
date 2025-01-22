class Demo
{
int reverseNumber(int n)
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
}