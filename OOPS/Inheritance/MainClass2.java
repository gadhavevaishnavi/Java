//Upcasting -Object of child class referances parent class(widening / generalzation)

class MainClass2
{
public static void main(String args[])
{
//demo1  <-- demo2  <-- demo3

Demo1 d1 = new Demo2();
d1.m1();
d1.m2();
d1.m3();

Demo2 d2 = new Demo3();
d2.m4();
d2.m5();
d2.m6();
 
Demo3 d3 = new Demo3();
d3.m7();
d3.m8();
d3.m9();

//if method override then nearar method of child class is called 

}
}