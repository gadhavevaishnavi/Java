import java.util.Arrays;


/*
package a.b.c.d.e;
public class Demo
{
    public int a,b;
   public void display()
    {
        System.out.println("a="+a+"b="+b);
    }
}


//  java.lang.ArithmeticException: / by zero
class MainClass
{
    public static void main(String args[])
    {   int a=10,c;
        System.out.println("Program Started");
        try {
            c = a / 0;
        }catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("Program Ended");
    }
}



//java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
class MainClass
{
    public static void main(String args[])
    {
        int a[] = {1,2,3,4,5};
        for(int i=0;i<a.length+1;i++)
            try {
                System.out.println(a[i]);
            }catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
    }
}

//java.lang.StringIndexOutOfBoundsException: Range [1, 6) out of bounds for length 5
class MainClass
{
    public static void main(String args[])
    {
        String s="hello";
        System.out.println(s);
        //for(int i=0;i<s.length()+1;i++)
            try {
                s.substring(1, 6);
            }catch (StringIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
        System.out.println("Program Executed Succesfully");
    }
}

 */

//java.lang.NegativeArraySizeException: -1

import java.util.Arrays;
class MainClass
{
    public static void main(String args[])
    {
        int a[] = {1,2,3,4,5};
        System.out.println("Array a[] print successfully " +Arrays.toString(a));
        try {
            int b[] = new int[-1];
        }catch (NegativeArraySizeException e)
        {
            System.out.println(e);
        }
        System.out.println("program ended");

        //java.lang.NullPointerException: Cannot read the array length because "c" is null
        
        int c[] = null;
        try {
            System.out.println(c.length);
        }catch (NullPointerException e)
        {
            System.out.println(e);
        }
    }
}

