public class Word9
{
    public static void main(String[] args) 
{
        String s1 ="Hello I Am Java Developer";
        String s2[] = s1.split(" ");

        StringBuilder sb = new StringBuilder();
        for(int i=0;i< s2.length;i++)
        {
            String temp = s2[i];
            if (temp.length()>1)
            {
                sb.append(temp.substring(1, temp.length() - 1));    //ell
              sb.append(temp.charAt(0));  //ellHAavJevelopeD   //ellH
            }
           sb.append(temp.charAt(temp.length()-1));   //ellHAavJevelopeD  //ellHo

            if(i< s2.length-1)
            {
                sb.append(" ");   //ellHo I Am avJa evelopeDr
            }
        }
        System.out.println(sb);
    }
}