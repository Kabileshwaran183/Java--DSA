public class KadanesAlgMaxSumOfSubArray {

    public static void main(String[] args){
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int res = maxSubarraySum(arr);
        System.out.print(res);
    }
    public static int maxSubarraySum(int[] arr) {
        // Your code here
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int n:arr) {
            sum+=n;
            if(max<sum) max=sum;
            if(sum<0) sum=0;
        }
        return max;
    }
}
