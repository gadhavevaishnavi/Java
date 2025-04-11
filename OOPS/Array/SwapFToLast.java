/*
SWAP FIRST AND LAST ELEMENT OF ARRAY
 WITHOUT USING THIRD VARIABLE

i/p- {10,20,30,40,50}

o/p-[50, 20, 30, 40, 10]
*/

import java.util.Arrays;
class SwapFToLast
{
public static void main(String args[])
{
	int a[]= {10,20,30,40,50};
	a[0]=a[0]+a[a.length-1];           //60
	a[a.length-1]=a[0]-a[a.length-1];  //50
	a[0]=a[0]-a[a.length-1];         //10


	System.out.println(Arrays.toString(a));
   }
}