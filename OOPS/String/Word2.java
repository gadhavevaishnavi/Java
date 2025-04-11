/*
i/p - welcome to international airport
o/p - international
 */

 class Word2
 {
    public static void main(String[] args)
    {
        String s1 =   " welcome to international airport";
        String s2[] = s1.split(" ");
        int size =0;
        for(int i=0;i<s2.length;i++)
            if (size < s2[i].length())
                size = s2[i].length();

        else
            for(i = 0; i<s2.length; i++)

                if(size == s2[i].length())

                    System.out.println(s2[i]);

    }
}