public class Pattern4 {
    public static void main(String[] args) {
        int n = 4;
        p(n);
    }
//                   1
//                 2 1 2
//               3 2 1 2 3
//             4 3 2 1 2 3 4
//               3 2 1 2 3
//                 2 1 2
//                   1
    public static void p(int n)
    {
        for(int i=1; i<=2*n-1; i++)
        {
            int col = i>n ? 2*n-i : i;
            int space=n-col;
            for(int j=1; j<=space; j++) System.out.print("  ");
            for(int j=col; j>0; j--) System.out.print(j + " ");
            for(int j=2; j<=col ; j++) System.out.print(j + " ");
            System.out.println();
        }
    }

}
