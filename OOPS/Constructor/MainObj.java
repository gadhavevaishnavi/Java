class MainObj
{
public static void main(String args[])
{
ObjCreation ob = new ObjCreation();
ObjCreation ob1 = new ObjCreation(12,23);

ob.a=20;
ob.b=40;
ob.display();           // a=20 b=40

////reference object(Access Multiple element of class)
ObjCreation ob2=ob1;           
ob1.a=30;
ob1.b=60;

ob1.display();             //ob1 & ob2 are same  i.e- a=30 b=60
ob2.display();             //a=30 b=60



System.out.println(ob1.hashCode());         //display hashcode
System.out.println(ob1.equals(ob2));        // compare 2 objects on the basis of values i.e -true

//unreferenced object (Access single element in class)
new ObjCreation().display();   //a=0 b=0

new ObjCreation().a=10;

}

}








/*

new ObjCreation().a=10;
new ObjCreation().b=50;
 new ObjCreation().display(); 
System.out.println(200);        
*/