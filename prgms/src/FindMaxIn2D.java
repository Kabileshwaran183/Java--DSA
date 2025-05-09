public class FindMaxIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {-44433254, -2000, -4, -2},
                {4, -200, -1, -2},
                {443, 200, -4, 0},
                {54, 600, 14, 2}
        };
        findmaxelement(arr);
    }

    private static void findmaxelement(int[][] arr) {
        int max = Integer.MIN_VALUE;   // int min= Integer.MAX_VALUE; --> minimum value
        for (int[] a : arr) for(int n : a) if (max < n) max = n;
        System.out.println("max : " + max );
    }
}
