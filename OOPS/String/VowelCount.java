public class VowelCount
{
    public static void main(String[] args) {

    String s1 ="International";
    int count=0;
    for(int i=0;i<s1.length();i++)
        if(
                s1.charAt(i)=='a'||  s1.charAt(i)=='A'||s1.charAt(i)=='e'||s1.charAt(i)=='E'||s1.charAt(i)=='i'
                        ||s1.charAt(i)=='I'|| s1.charAt(i)=='o'||s1.charAt(i)=='O'||s1.charAt(i)=='u'||s1.charAt(i)=='U')
            count++;
        System.out.println(count);
    }
}


/*
METHOD - II
-------------

public class Main
{
    public static void main(String[] args)
     {
        String s1="International";

        int count=0;
        for(int i=0;i<s1.length();i++) {
            char c = s1.charAt(i);
            if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U')
                count++;
        }
        System.out.println(count);
    }
}

//METHOD-III
-----------------

import java.util.Locale;

public class Main
 {
    public static void main(String[] args)
    {

        String s1 ="International";
        String s2 = s1.toUpperCase();
        int count = 0;
        for (int i=0;i<s1.length();i++)
        {
            char c = s2.charAt(i);
            if(c=='A'|| c=='E'||c=='I'||c=='O'||c=='U')
                count++;
        }
        System.out.println(count);
    }
}

METHOD- IV
------------

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String s1 ="International";
        String s2 = "AEIOUaeiou";
        int count = 0;
        for (int i=0;i<s1.length();i++)
        {
            if(s2.contains(String.valueOf(s1.charAt(i))))
                count++;
        }
        System.out.println(count);
    }
}
*/