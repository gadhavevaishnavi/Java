class MainClass
{
public static void main(String args[])
{
Demo d1= new Demo();
System.out.println(d1.findLastDigit(12345));
System.out.println(d1.findSecondLastDigit(12345));
System.out.println(d1.findFirstDigit(12345));
System.out.println(d1.findSecondDigit(54321));
System.out.println(d1.findSumOfDigit(98765));
System.out.println(d1.findAvgOfDigit(98765));
System.out.println(d1.shiftFirstToLast(98765));
System.out.println(d1.shiftLastToFirst(12345));
}
}