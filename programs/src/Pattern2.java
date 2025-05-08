public class Pattern2 {
    public static void main(String[] args){
        int n = 4;
        p1(n);
        System.out.println("-------------------------------------");
        p2(n);
        System.out.println("-------------------------------------");
        p3(n);
        System.out.println("-------------------------------------");
    }

//            *
//            **
//            ***
//            ****
    static void p1(int n)
    {
        for (int i=1; i<=n ; i++)      // for (int i=n; i>=1 ; i--)      for 5 star to 1.
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//        *
//        **
//        ***
//        ****
//        ***
//        **
//        *
    static void p2(int n)
    {

        for (int i=1; i < 2*n ; i++)   // 1 to 7
        {
            int col = i > n ? (2*n -i)  :  i ;
            for (int j=1; j<=col; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p3(int n)
    {
        for(int i=1; i<2*n; i++)
        {

            int col = i > n ? (2*n -i) : i;
            int space = n-col;
            for(int j=1; j<=space; j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=col;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
