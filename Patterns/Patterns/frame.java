class frame
{
public static void main(String args[])
{
int n=5;
for(int l=1;l<=n;l++)
{
for(int k=1;k<=n;k++)
{
for(int j=1;j<=n;j++)
{
	for(int i=1;i<=n;i++)	
	if((j+l)%2==0)
		if((i+k)%2==0)
			System.out.print("*");
		else
			System.out.print(" ");	
	else
			System.out.print(" ");
}
System.out.println();
}
System.out.println();
}
}
}