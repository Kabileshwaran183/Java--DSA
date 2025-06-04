public class Pattern8 {
    public static void main(String[] args){
        int n = 4;
        printPattern(n-1);
    }

    private static void printPattern(int n) {
        for(int i=1; i<2*n;i++)
        {
            int col = i<=n ? i : n-(i-n) ;
            for(int j=1; j<=col; j++) System.out.print((char)(64 + j));
            for(int j=1; j<=col; j++) System.out.print(j);
            for(int j=1; j<=2*(n-col);j++) System.out.print(" ");
            for(int j=col; j>0; j--) System.out.print(j);
            for(int j=col; j>0; j--) System.out.print((char)(64 + j));

            System.out.println();
        }
    }
}
//A1    1A
//AB12  21BA
//ABC123321CBA
//AB12  21BA
//A1    1A