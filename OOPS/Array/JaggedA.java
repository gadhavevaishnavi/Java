
/*

--2D Array --
86      0       0       0       0
0       10      0       0       0
0       0       0       0       20
0       0       0       0       0
0       0       0       0       0
--Jagged Array --
11      12
123     32      1
32      43      55
*/

import java.util.Arrays;
class JaggedA
{
public static void main(String args[])
{
System.out.println("--2D Array --");
	int a[][] = new int [5][5];
	a[1][1]=10;
	a[2][4]=20;
	a[0][0]=86;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
		System.out.print(a[i][j] +"\t");
		}
	System.out.println();
	} 

System.out.println("--Jagged Array --");
	int b[][] = {{11,12},{123,32,1},{32,43,55}};
	
	for(int i=0;i<b.length;i++)
	{
		for(int j=0;j<b[i].length;j++)
		{
		System.out.print(b[i][j] +"\t");
		}
	System.out.println();
	} 
     }

}