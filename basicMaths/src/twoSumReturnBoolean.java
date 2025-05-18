import java.util.HashSet;

public class twoSumReturnBoolean {

    public static void main(String[] args){
        int[]  arr = {1, 4, 45, 6, 10, 8};
        int target = 6;
        boolean res= twoSum(arr, target);
        System.out.print(res);
    }
    static boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> seen = new HashSet<>();
        for(int num:arr)
        {
            int complement = target - num;
            if (seen.contains(complement)) return true;
            seen.add(num);
        }
        return false;
    }
}
