import java.util.Arrays;
 class OddRepalce
{
    public static void main(String[] args) {
        int a[] = {1, 51, 12, 63, 14, 35, 121, 822}; 
	  System.out.println("Modified Array :");
        for (int i = 0; i < a.length; i++) 
	{
            if (a[i]%2 != 0) 
		{   
                while (a[i] > 10)  
                    a[i]/= 10;       
              }
            System.out.println(a[i]);
      	   
        }
 System.out.println(Arrays.toString(a));
    }

}