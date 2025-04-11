public class Word_6
{
    public static void main(String[] args)
    {
    String s1="Hello I Am Java Developer";
    String s2[] = s1.split(" ");

    StringBuilder sb = new StringBuilder();
    StringBuilder last = new StringBuilder();
    for(int i=0;i<s2.length;i++)
    {
            sb.append(s2[i].substring(1));
        last.append(s2[i].charAt(0));
        //if(i<s2.length-1)
            sb.append(" ");
    }
       sb.append(last);
        System.out.println(sb);

    }
}