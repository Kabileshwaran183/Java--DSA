public class Pattern7 {
    public static void main(String[] args){
        int n = 3;
        printPattern(n);
    }

    private static void printPattern(int n) {
        for(int i=0; i< 2*n; i++)
        {
            if(i<n) for(int j=1; j<= n-i; j++) System.out.print("*");
            else for(int j=1; j<= (i-n+1) ; j++) System.out.print("*");
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