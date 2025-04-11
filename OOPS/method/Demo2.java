class Demo2
{
    int reverseNumber(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum*=10;
            sum+=n%10;
            n/=10;
        }
        return sum;
    }


int addSumToLast(int n) //1234
{
int sum=0,temp=n;
while(temp!=0)
{
sum += temp%10;
temp/=10;
}
if (sum<10)
 n*=10;
else 
 n*=100;
return n+sum;
	

}

}