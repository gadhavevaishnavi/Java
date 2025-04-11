// 4- BY COPY OF ARRAY

import java.util.Arrays;
class Array4
{
    public static void main(String args[])   //FOR Multiple arguments
    {
        int a[]={1,2,3,4,5};
	int b[]=new int[a.length];
  // int b[]=Arrays.copyOf(a,a.length);
	for(int i=0;i<a.length;i++)
	{
	b[i]=a[i];
	}
System.out.println(Arrays.toString(a));     //[1, 2, 3, 4, 5]
System.out.println(Arrays.toString(b));     //[1, 2, 3, 4, 5]
     System.out.println(a==b);   //false (bcs it copy by only values)
    

 }
}