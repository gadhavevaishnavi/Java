// CREATE ARRAY USING-

//1- new Keyword

import java.util.Arrays;
class Array1
{
    public static void main(String args[])
    {
        int a[]= new int[5];
        a[0]=10;
        a[1]=20;
        a[4]=30;
        System.out.println(Arrays.toString(a));  //[10, 20, 0, 0, 30]
    }
}

