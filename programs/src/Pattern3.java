public class Pattern3 {
    public static void main(String[] args) {
        int n = 4;
        p(n);
        p2(n);
    }
//                   1
//                 2 1 2
//               3 2 1 2 3
//             4 3 2 1 2 3 4

    public static void p(int n)
    {
       for(int i=1; i<=n; i++)
       {
           int space=n-i;
           for(int j=1; j<=space; j++) System.out.print("  ");
           for(int j=i; j>0; j--) System.out.print(j + " ");
           for(int j=2; j<=i ; j++) System.out.print(j + " ");
           System.out.println();
       }
    }
    public static void p2(int n)
    {
        for(int i=1; i<=n; i++)
        {
            int space=n-i;
            for(int j=1; j<=space; j++) System.out.print("  ");
            for(int j=1; j<=i; j++) System.out.print(j + " ");
            for(int j=i-1; j>0 ; j--) System.out.print(j + " ");
            System.out.println();
        }
    }

}
