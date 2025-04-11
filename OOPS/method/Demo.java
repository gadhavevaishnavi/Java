class Demo
{
    int findLastDigit(int n)
    {
        return n%10;
    }
    int findSecondLastDigit(int n)
    {
        return (n/10)%10;
    }

    int findFirstDigit(int n)
    {
        while(n>=10)
            n/=10;
        return n%10;
    }

    int findSecondDigit(int n)
    {
        while(n>=100)
            n/=10;
        return n%10;

    }
    int findSumOfDigit(int n)
{
int sum=0;
while(n!=0)
{
sum+=n%10;
n/=10;
}
return sum;
}

double findAvgOfDigit(int n)
{
double avg=0;
int count =0;
while(n!=0)
{
	avg+=n%10;
	count++;
	n/=10;
}
return avg/count;

}

int shiftFirstToLast(int n)
{
int length=1,first=n;
while(first >= 10)
{
length *=10;
first /=10;
}
n%=length;
n*=10;
n+=first;
return n;
}

int shiftLastToFirst(int n) // 1234
{
int length=1, rem;  //1
int last = n%10;  //4
rem=n/10;                   //123
while(n>=10)               //1234>10
{
n/=10;                     // 1234/10=123
length*=10;               //1*10
}

return last*length + rem; // 4*1000+123

}
} 