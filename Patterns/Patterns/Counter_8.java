/*
55	
54	45	
53	44	36	
52	43	35	28	
51	42	34	27	21	
50	41	33	26	20	15	
49	40	32	25	19	14	10	
48	39	31	24	18	13	9	6	
47	38	30	23	17	12	8	5	3	
46	37	29	22	16	11	7	4	2	1	
*/
 class Counter_8 {
    public static void main(String[] args) {

        int n=10;
        int count=(n*(n+1))/2;
        for(int i=n;i>=1;i--)
        {
            int c=count;
            for(int j=n;j>=i;j--)
            {
                System.out.print(c +"\t");
                c-=j-1;
            }
            System.out.println();
            count--;
        }
    }
}