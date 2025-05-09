public class Findmaxele {
    public static void main(String[] args) {
        int[] arr = {-44433254, -2000, -4, -2};
        findmaxelement(arr);
    }

    private static void findmaxelement(int[] arr) {
        int max = Integer.MIN_VALUE;   // int min= Integer.MAX_VALUE; --> minimum value
        for (int i = 0; i < arr.length; i++) if (max < arr[i]) max = arr[i];
        System.out.println("max : " + max );
    }
}
