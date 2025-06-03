import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FrequenciesInLimitedArray {
    public static void main(String[] args){
        int[] a = {2, 3, 2, 3, 5};
        System.out.println(frequencyCount(a));
    }
    public static List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
        ArrayList<Integer> resList = new ArrayList <>();
        HashMap<Integer,Integer> mapArr= new HashMap<>();
        for (int num : arr) mapArr.put(num,mapArr.getOrDefault(num,0)+1);
        int i=1;
        while (i<=arr.length) {
            resList.add(mapArr.getOrDefault(i,0));
            i++;
        }
        return resList;
    }

    // optimized way to use without hashmap..............
//    public List<Integer> frequencyCountOptimized(int[] arr) {
//        int n = arr.length;
//        int[] freq = new int[n]; // index 0 => count of 1, index 1 => count of 2, ...
//
//        for (int num : arr) {
//            if (num >= 1 && num <= n) {
//                freq[num - 1]++;
//            }
//        }
//
//        List<Integer> result = new ArrayList<>();
//        for (int f : freq) result.add(f);
//        return result;
//    }
}


