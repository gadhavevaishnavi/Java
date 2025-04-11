
/*

Enter Value :
10
Enter Value :
20
Addition : 30.0

*/
import java.util.Scanner;
class Scan1
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Value :");
        int a = sc.nextInt();

        System.out.println("Enter Value :");
        float b = sc.nextFloat();

        System.out.println("Addition : "+(a+b));



/*
whole string part get skipped in scanner class 
hence for String ,use BufferedReader

        System.out.println(" Enter Your Name :");
        String name = sc.nextLine();
        System.out.println("Name : "+name);
*/

    }
}