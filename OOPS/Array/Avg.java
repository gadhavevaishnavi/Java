
/*
i/p-int a[]={1,2,3,4,5};
o/p-
Greater Elements:
4
5
*/

class Avg{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        double avg=0;
	
        for(int i=0;i<a.length;i++)
        {
            avg+=a[i];
            //avg/=a.length;
        }avg/=a.length;
        System.out.println("Greater Elements: ");
        for(int i=0;i<a.length;i++)
        {
             if (a[i] > avg)
                System.out.println(a[i]);
}
    }
}