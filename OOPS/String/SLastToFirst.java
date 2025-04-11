
public class SLastToFirst
 {
    public static void main(String[] args) 
{

        String s1 = "India";
       /* // METHOS=I-

        StringBuilder sb = new StringBuilder();
        sb.append(s1.charAt(s1.length()-1)); //a
        sb.append(s1.substring(0,s1.length()-1)); //aIndi
        System.out.println(sb);

        //METHOD-II

        StringBuilder sb = new StringBuilder(s1);
      sb.insert(0,sb.charAt(s1.length()-1));
      sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
*/
        //METHOD-III

        StringBuilder sb = new StringBuilder();
        sb.append(s1.charAt(s1.length()-1));
        for(int i=0;i<s1.length()-1;i++)
            sb.append(s1.charAt(i));

        System.out.println(sb);
    }
}