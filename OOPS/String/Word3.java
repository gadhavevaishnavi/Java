class Word3
{
    public static void main(String[] args) 
{

        String s1="welcome to inernational airport";
        String s2[] =s1.split(" ");
        int size=0;
        for(int i=0;i<s2.length;i++) {
            if (size < s2[i].length())
                size = s2[i].length();
        }
        for(int i=0;i<s2.length;i++) { // //To find similar word ,if max word written multiple times
            if (size == s2[i].length())
            {
              //  size = s2[i].length();
                System.out.println(s2[i]);
            }
        }

    }
}