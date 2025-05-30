import java.util.HashSet;

public class twoSumReturnCount {

    public static void main(String[] args){
        int[]  arr = {1, 4,12, 45, 6, 10, 8};
        int target = 16;
        int res= twoSum(arr, target);
        System.out.print(res);
    }
    static int twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> seen = new HashSet<>();
        int count =0;
        for(int num:arr)
        {
            int complement = target - num;
            if (seen.contains(complement)) count++;
            seen.add(num);
        }
        return count;
    }
}