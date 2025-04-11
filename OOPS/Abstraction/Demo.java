abstract  class Demo {

    void m1()
    {
        System.out.println("m1 method of Demo");
    }
    abstract void m2();
    Demo()
    {
        System.out.println("Default Consructor of Demo");
    }
    Demo(int a)
    {
        System.out.println("User-Defined Constructor of Demo");
    }
}