// 3- BY USING STATIC WAY

import java.util.Arrays;
class Array3
{
    public static void main(String args[])   //FOR Multiple arguments
    {
        int a[]={1,2,3,4,5};
        int b[]={1,2,3,4,5};w/
        System.out.println(a);
        // it returns in hashcode in hexadecimal representation [I@2f92e0f4]

        System.out.println(Arrays.toString(a));  //[1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(b));  //[1, 2, 3, 4, 5]
        System.out.println(a==b);  //false (bcs its memory is different hence it compare values )
    }
}