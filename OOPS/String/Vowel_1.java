/*
input- International
output- I13n12t11e10r9n8a7t6i5o4n3a2l1
 */
public class Vowel_1
{
    public static void main(String[] args)
 {

        String s1 = "International";
    /*
        //METHOD-I

        StringBuilder sb = new StringBuilder();
        int count =s1.length();
         for(int i=0;i<s1.length();i++)

             System.out.print(s1.charAt(i)+""+ count--); //I13n12t11e10r9n8a7t6i5o4n3a2l1
     */
        StringBuilder sb =new StringBuilder(s1);
        int count =0;
        for(int i=sb.length()-1;i>=0;i--)
            sb.insert(i+1, ++ count);
        System.out.println(sb);
    }
}