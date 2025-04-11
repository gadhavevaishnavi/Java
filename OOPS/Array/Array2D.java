//2D ARRAY
/*

86      0       0       0       0
0       10      0       0       0
0       0       0       0       20
0       0       0       0       0
0       0       0       0       0

*/

import java.util.Arrays;
class Array2D
{
public static void main(String args[])
{

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
	
     }

}