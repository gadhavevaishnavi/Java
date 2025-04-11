/*
WAP TO AVERAGE OF ODD ELEMENTS OF ARRAY

i/p-{1,2,3,4,5,6,7,8}
O/P-Avg=4.0
*/

class OddAvg
{
public static void main(String args[])
{
	int a[]= {1,2,3,4,5,6,7,8};
	double avg=0;
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		 if(a[i]%2!=0)
		{	
			avg+=a[i];    //0+1=1+3=4+5=9+7=16
			count++;      // 4     
		}
 	}
	avg/=count;    //16/4=4 
	System.out.println("Avg="+avg);
   }
}