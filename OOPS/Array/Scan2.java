/*
Enter name, age and salary:
Pyaari
20
250000
Name: Pyaari
Age: 20
Salary: 250000.0

*/

import java.util.Scanner;

class Scan2
{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter name, age and salary:");

   
    String name = sc.nextLine();   // String input
    int age =sc.nextInt();        // Numerical input
    double salary = sc.nextDouble();

    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}