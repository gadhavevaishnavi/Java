class Demo1
{
int shiftLastToFirst(int n)
{
int last = n%10,length=1,temp=n/10;
while(temp!=0)
{
length*=10;
temp/=10;
}
last*=length;
last+=n/10;
return last;
}
}