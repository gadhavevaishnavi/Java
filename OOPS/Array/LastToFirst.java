/*
SHIFT last ELEMENT TO THE 1st FROM ARRAY

i/p-{10,20,30,40,50}
O/P-[50, 10, 20, 30, 40]

*/
import java.util.Arrays;
class LastToFirst
{
public static void main(String args[])
{
	int a[]= {10,20,30,40,50};
	int temp=a[a.length-1];     //50
	for(int i=a.length-2;i>=0;i--)
	{
		a[i+1]=a[i];
	}
	a[0]=temp;
	System.out.println(Arrays.toString(a));
   }
}