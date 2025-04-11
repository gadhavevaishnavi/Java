public class LastToFirst
{
    public static void main(String[] args) {
	String s1="India";
 
	//METHOD-I

      /*   StringBuilder sb= new StringBuilder();
       for(int i=1;i<s1.length();i++)
        {
            sb.append(s1.charAt(i));
        }

        sb.append(s1.charAt(0));
       System.out.println(sb);


        //METHOD-II

        StringBuilder sb= new StringBuilder();
        sb.append(s1.substring(1));
        sb.append(s1.charAt(0));
        System.out.println(sb);

        //METHOD-III
        StringBuilder sb= new StringBuilder(s1.substring(1));
        sb.append(s1.charAt(0));
        System.out.println(sb);


        //METHOD-IV-

    String s2 = " ";
        StringBuilder sb= new StringBuilder();
        for(int i=1;i<s1.length();i++)
            s2 +=s1.charAt(i);
        s2+=s1.charAt(0);
        System.out.println(s2);
      */

	
        //METHOD-IV-
        StringBuilder sb= new StringBuilder(s1);
   //    char c = s1.charAt(0);
        sb.deleteCharAt(0);
        sb.append(s1.charAt(0));

        //System.out.println(c);
        System.out.println(sb);
    }

}