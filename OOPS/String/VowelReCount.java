/*
i/p- International
o/p- 1nt2rn1t21n2l
 */

public class VowelReCount
{
    public static void main(String[] args) {

        String s1 = "International";
        String s2 = "AEIOUaeiou";
        int count=1;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s1.length();i++)
        {
            if(s2.contains(String.valueOf(s1.charAt(i))))
            {
                if(count % 2 != 0)
                {
                    sb.append(1);
                }
                else
                {
                    sb.append(2);
                }
                count++;
            }
            else
               sb.append(s1.charAt(i));
        }
        System.out.println(sb);
    }
}