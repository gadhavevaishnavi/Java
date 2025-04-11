1-//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
*********
 *******
  *****
   ***
    *
 */
public class Main {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=((n-i+1)*2)-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
} 


-------------------------------------------------------------
2- /*
    1
   222
  33333
 4444444
555555555
 */


public class Main {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2)-1;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

-----------------------------------------------------
3-/*
111111111
 2222222
  33333
   444
    5

 */

public class Main {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=((n-i+1)*2)-1;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

-----------------------------------------------------
4-/*
/*
123454321
 1234321
  12321
   121
    1

*/


public class Main {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
                System.out.print(j);
            for(int j=i-1;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

-----------------------------------------------------
5-/*

    1
   212
  32123
 4321234
543212345
*/


public class Main {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
                System.out.print(" ");
            for(int j=i;j>=1;j--)
                System.out.print(j);
            for(int j=2;j<=i;j++)
                System.out.print(j);
            System.out.println();
        }
    }
}

-----------------------------------------------------
6-/*
123454321
 2345432
  34543
   454
    5
*/


public class Main {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
                System.out.print(j);
            for(int j=n-1;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

-----------------------------------------------------
/*
      5
     545
    54345
   5432345
  543212345
*/


public class Main {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>1;j--)
                System.out.print(" ");
            for(int j=n;j>=i;j--)
                System.out.print(j);
            for(int j=i+1;j<=n;j++)
                System.out.print(j);
            System.out.println();
        }
    }
}

-----------------------------------------------------
/*
543212345
 5432345
  54345
   545
    5
*/


public class Main {
    public static void main(String[] args) {
        int n=8;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--)
                System.out.print(j);
            for(int j=i+1;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

-----------------------------------------------------
/*
      5
     454
    34543
   2345432
  123454321
*/


public class Main {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>1;j--)
                System.out.print(" ");
            for(int j=i;j<=n;j++)
                System.out.print(j);
            for(int j=n-1;j>=i;j--)
                System.out.print(j);
            System.out.println();
        }
    }
}

-----------------------------------------------------

/*

    A
   bbb
  CCCCC
 ddddddd
EEEEEEEEE
*/


public class Main {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
                System.out.print(" ");
            for(int j=1;j<=(i*2)-1;j++)
                if(i%2!=0)
                    System.out.print((char)(i+64));
                else
                    System.out.print((char)(i+96));


            System.out.println();
        }
    }
}

-----------------------------------------------------
/*
AAAAAAAAA
 bbbbbbb
  CCCCC
   ddd
    E

 */


public class Main {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=((n-i+1)*2)-1;j++)
            { if(i%2!=0)
                System.out.print((char)(i+64));
               else
                System.out.print((char)(i+96));
            }
            System.out.println();
        }
    }
}

-----------------------------------------------------
/*

    E
   ddd
  CCCCC
 bbbbbbb
AAAAAAAAA
 */


public class Main {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>1;j--)
                System.out.print(" ");
            for(int j=1;j<=((n-i+1)*2)-1;j++)
            {
                if(i%2!=0)
                    System.out.print((char)(i+64));
                else
                    System.out.print((char)(i+96));
            }
            System.out.println();
        }
    }
}

-----------------------------------------------------