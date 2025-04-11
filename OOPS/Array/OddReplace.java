/*
i/p-{10,87,12,53,14};
o/p-
10
8
12
5
14
*/
class OddReplace{
    public static void main(String[] args) {
        int a[]={10,87,12,53,14};
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0){
		
		while(a[i]>10)
			a[i]/=10;

         }
	 System.out.println(a[i]);
    }}
}