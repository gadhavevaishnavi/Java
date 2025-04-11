/*
i/p - welcome to international airport
o/p - international
 */

public class Word{
    public static void main(String[] args) {
        
      String s1 =   " welcome to international airport";
        String s2 = s1.split(" ");
      int count =0;
     
      for(int i=0;i<s2.length;i++)
	if(count<s2[i].length())
		count = s2[i].length();
          
	else 
	 for(int i=0;i<s2.length;i++)
	if(count==s2[i].length())
		System.out.println(s2[i]);
          
     
    }
}