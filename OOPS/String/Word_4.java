
public class Word_4
{
    public static void main(String[] args) {
        String s1 = "hey I Am Vaishnavi";
        String s2[] = s1.split(" ");

        StringBuilder sb = new StringBuilder();
        for(int i=0;i< s2.length;i++)
        {
            String temp = s2[i];
            sb.append(new StringBuilder(temp).reverse());

            if(i<s2.length-1)
             sb.append(" ");
        }

        System.out.println(sb);
    
        }
}