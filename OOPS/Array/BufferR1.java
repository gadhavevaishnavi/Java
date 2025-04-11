
/*

Enter Number :
88
Enter Number :
76
Addition : 164

 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
class BufferR1
{
    public static void main(String args[]) throws IOException
    {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);

        System.out.println("Enter Number :");
        int a= Integer.parseInt(br.readLine());

        System.out.println("Enter Number :");
        int b= Integer.parseInt(br.readLine());

        System.out.println("Addition : "+(a+b));

    }

}