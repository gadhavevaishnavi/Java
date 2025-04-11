public class StringSBSbf
{
    public static void main(String[] args) 
{

        StringBuilder sb = new StringBuilder("India");
        System.out.println(sb); //India

     //   append() method used in StringBuilder and StringBuffer to concatinate two string instead of concat()
        sb.append(" Country");
        System.out.println(sb);//India Country


        StringBuffer sbf = new StringBuffer("India");
        System.out.println(sbf); //India

        //   append() method used in StringBuilder and StringBuffer to concatinate two string instead of concat()
        sbf.append(" Is My Country");
        System.out.println(sbf);//India Is My Country
    }
}