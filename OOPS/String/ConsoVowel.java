/*
i/p- International
o/p- ntrntnlIeaioa

 */

public class ConsoVowel
{
    public static void main(String[] args)
 {
    String s1 = "International";
    String s2 = "AEIOUaeiou";
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<s1.length();i++)
    {
        if(!(s2.contains(String.valueOf(s1.charAt(i)))))
            sb.append(s1.charAt(i));
    }
        for(int i=0;i<s1.length();i++)
        {
            if((s2.contains(String.valueOf(s1.charAt(i)))))
                sb.append(s1.charAt(i));
        }
        System.out.println(sb);
    }
}