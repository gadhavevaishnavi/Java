
/*

Average of odd and even elements in array
i/p-{17,16,21,15,22,10,5,12,25,14};
o/p-
odd Average =16.6
Even Average =14.8
 */

class ArrayOddEven
 {
public static void main(String[] args) 
{
int a[]={17,16,21,15,22,10,5,12,25,14};
double oddavg=0;
double evenavg =0;
int oddcount=0;
for(int i=0; i<a.length;i++)
    if(a[i]%2!=0)
    {
        oddavg+= a[i];
       oddcount++;
    }
    else
        evenavg+=a[i];
oddavg/=oddcount;
evenavg/=(a.length - oddcount);
System.out.println("odd Average =" +oddavg);
System.out.println("Even Average =" +evenavg);

    }
}