
/*


*/
import java.io.BufferReader;
import java.io.InputStreamReader;
import java.util.Arrays;
class BufferR1
{
public static void main(String args[])
{
 
InputStreamReader isr = new InputStreamReader(System.in);
BufferReader br = new BufferReader (isr);

System.out.println("Enter Number :");
int a = Integer.parseInt(br.readLine());

System.out.println("Enter Number :");
int b = Integer.parseInt(br.readLine());

System.out.println(a+b);

}

}