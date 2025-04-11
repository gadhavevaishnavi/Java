// 5- BY ANNONYMOUS WAY

import java.util.Arrays;
class Array5
{
    public static void main(String args[])   //FOR Multiple arguments
    {
        int a[]={1,2,3,4,5};
	System.out.println(Arrays.toString(a));  //REFERENCED
	
	System.out.println(Arrays.toString(new int[] {10,20,30,22,11}));  //[10, 20, 30, 22, 11]
	
 	//to find element using index
	int value=new int[] {11,22,33,44,55}[3];
	System.out.println(value);    //44


	//To find length of a given array
	int length =new int[]{11,10,9,8,6,5,3,4,2}.length;
	System.out.println(length);   //9
 }
}