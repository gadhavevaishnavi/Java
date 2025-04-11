//2- by using referance

import java.util.Arrays;
class Array2
{
public static void main(String args[])
{
	int a[]={10,20,30,40};
	int b[]=a;
	System.out.println(Arrays.toString(b));  //[10, 20, 30, 40]
	System.out.println(a==b);  //true  bcs it compare memory
}

}