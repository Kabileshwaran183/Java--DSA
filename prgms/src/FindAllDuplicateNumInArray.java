import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateNumInArray {
    public static void main(String[] args){
        int[] arr = {1, 3, 5, 4, 3, 2, 2, 5, 10 , 10, 1,2};
        List<Integer> res = DuplicateNumbers(arr);
        int listSize = res.size();
        if(listSize ==0) System.out.print("there is no duplicate values");
        else System.out.print(res);
    }
    private static List<Integer> DuplicateNumbers(int[] arr) {
        List<Integer> res = new ArrayList<>();
        boolean[] b = new boolean[arr.length];
        for(int val:arr)
        {
            int correctIndex = val-1;
            if(b[correctIndex]) res.add(val);
            else b[correctIndex] = true;
        }
        return res;
    }


}
