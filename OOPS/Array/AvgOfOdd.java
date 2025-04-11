
public AvgOfOdd
{
    public static void main(String[] args)
    {
        int a[] = {1,2,3,4,5};
        double avg=0;
        int count=0;
        for(int i=0;i<a.length;i++)
            if (a[i] % 2 != 0)
            {
                avg += a[i];
                //  System.out.println("avg=" + avg);
                count++;
            }
        System.out.println(avg /= count);
    }
}