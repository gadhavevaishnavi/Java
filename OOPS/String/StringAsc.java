
/*
i/p - International
o/p - Iaaeilnnnortt
 */
public class StringAsc
{
    public static void main(String[] args)
 {
        String s1 = "International";
       char c[] = s1.toCharArray();  //Convert string to Array
       java.util.Arrays.sort(c);
       String s2 = new String(c);  //String Constructor(Array convert into String)
        System.out.println(s2);
    }
}