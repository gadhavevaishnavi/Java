import java.util.Arrays;
import java.util.Scanner;

class array_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();  
        char[] c = s.toCharArray(); 
        for (int i = 0; i < c.length / 2; i++) {
            char temp = c[i];
            c[i] = c[c.length - 1 - i];
            c[c.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(c)); 
        String s1=String.valueOf(c);
	System.out.println(s1);
	if(s.equals(s1))
 		System.out.println("Palindrom");
	else
		System.out.println("not");
	
	
    }

}
