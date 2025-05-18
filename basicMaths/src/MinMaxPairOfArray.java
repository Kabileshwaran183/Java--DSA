public class MinMaxPairOfArray {
    public static void main(String[] args){
        int[] arr = {3, 2, 1, 56, 10000, 167};
        getMinMax(arr);
    }
    public static void getMinMax(int[] arr) {
        // Code Here
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num:arr){
            if (num>max) max= num;
            if (num<min) min= num;
        }
        System.out.print(min + " " +  max);

    }
}
