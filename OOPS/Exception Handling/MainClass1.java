class MainClass1
 {
    public static void main(String[] args) {
        int a=10;
        int b=a;
        System.out.println("Program Started....");

        new MainClass1(); // Creates a new instance of MainClass
        System.gc();      // Suggests that the Java Virtual Machine (JVM) perform garbage collection
        System.out.println("Program ended....");
    }

  
    public void finalize()
    {
        System.out.println("Finalize method called");
    }
}
/*
Program Started....
Program ended....
Finalize method called
*/