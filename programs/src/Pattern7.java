public class Pattern7 {
    public static void main(String[] args){
        int n = 3;
        printPattern(n);
    }

    private static void printPattern(int n) {
        for(int i=0; i< 2*n; i++)
        {
            int col = i<n ? n-i : i-n+1;
            for(int j=1; j<= col; j++) System.out.print("*");
            System.out.println();
        }
    }

}
//        ***
//        **
//        *
//        *
//        **
//        ***