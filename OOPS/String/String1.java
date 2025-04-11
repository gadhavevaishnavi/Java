import java.util.Arrays;
import java.util.Scanner;

public class String1	{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();  // Example: hello
        char[] c = s.toCharArray();  // Convert to char array

        for (int i = 0; i < c.length / 2; i++) {
            char temp = c[i];
            c[i] = c[c.length - 1 - i];
            c[c.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(c)); // [o, l, l, e, h]
        System.out.println(String.valueOf(c));  // olleh
	 System.out.println();
    }
}
