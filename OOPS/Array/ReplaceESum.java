/*
WAP TO REPLACE EVEN ELEMENTS WITH THEIR SUM

i/p-{11,23,34,45,56,67,76,2}
o/p-[11, 23, 7, 45, 11, 67, 13, 2]

*/
import java.util.Arrays;
class ReplaceESum
{
public static void main(String args[])
{
	int a[]= {11,23,34,45,56,67,76,2};
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{	
			int sum=0;
			while(a[i]!=0)  //34 !=0
			{
				sum+=a[i]%10;   //0+4
				a[i]/=10;	//3
			}
		a[i]=sum;
		}
	}
 	System.out.println(Arrays.toString(a));
}
}