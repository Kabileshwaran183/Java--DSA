import java.util.HashMap;

public class MajorityElementInArray {
    public static void main(String[] args){
        int[] nums = {2,2,2,3,3};
        int majEle = majorityElement(nums);
        System.out.print(majEle);
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> numsMap = new HashMap<>();
        for(int num:nums) numsMap.put(num, numsMap.getOrDefault(num,0)+1 );
        int max=0;
        int maxNum =0;
        for (HashMap.Entry<Integer, Integer> entry : numsMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value > max) {
                max = value;
                maxNum = key;
            }
        }
        return maxNum;
    }
//------------------------ where assume majority is more than the n/2 --------------------
    public static int majorityElement2(int[] nums) {
        HashMap<Integer,Integer> numsMap = new HashMap<>();
        int majorityLimit = nums.length/2 ;
        for(int num:nums){
            int val=numsMap.getOrDefault(num,0)+1;
            numsMap.put(num, val);
            if(val > majorityLimit) return num;
        }
        return -1;
    }
}
