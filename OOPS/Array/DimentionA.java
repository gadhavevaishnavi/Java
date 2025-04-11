// Understand dimention of array

import java.util.Arrays;

/*
[1, 2, 3, 4, 5]   <- 1D

11      22      33
44      55      66
77      88      99
10      20      30

-----------------------

11      22      33      4  <-JAGGED ARRAY
44      1
77      8       5
10      20      35
*/


class DimentionA
{
    public static void main(String args[])   //FOR Multiple arguments
    {
       int c[]={1,2,3,4,5};
	System.out.println(Arrays.toString(c));  //1D ARRAY  [1, 2, 3, 4, 5]
	
	int a[][]={{11,22,33},{44,55,66},{77,88,99},{10,20,30}};  // //2D ARRAY
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
			System.out.print(a[i][j]+"\t"); 
		System.out.println(); 
		
	}
System.out.println("-----------------------");

//JAGGED ARRAY
	
int b[][]={{11,22,33,4},{44,1},{77,8,5},{10,20,35}};   ////JAGGED ARRAY
	for(int i=0;i<b.length;i++)
	{
		for(int j=0;j<b[i].length;j++)
			System.out.print(b[i][j]+"\t");  
		System.out.println(); 
		
	}

     }
}































