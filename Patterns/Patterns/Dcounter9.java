
/*
				OA	
			JC	NB	
		FF	IE	MD	
	CJ	EI	HH	LG	
AO	BN	DM	GL	KK	

*/

public class Dcounter9{
    public static void main(String[] args) {

        int n=5;
        int count1=(n*(n+1))/2;
        int count2=1;

        for(int i1=n,i2=1;i1>=1||i2<=n;i1--,i2++)
        {
            int c1=count1;
            int c2=count2;

            for(int j=i1;j>1;j--)
            {
                System.out.print("\t");
            }
            for(int j=i1;j<=n;j++)
            {
                System.out.print((char)(c1+64));
                System.out.print((char)(c2+64));
                System.out.print("\t");
                c1+=j;
                c2--;
            }
            System.out.println();
            count1-=i1;
            count2+=i2+1;


        }
    }
}