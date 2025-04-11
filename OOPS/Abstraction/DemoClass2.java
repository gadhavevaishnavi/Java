class DemoClass2 implements Demo1,Demo2
{
    public void m3()
    {
        System.out.println("m3 methof of DemoClass2");
        Demo1.super.m3();  // to call perticular class where similar method exist
    }
}

