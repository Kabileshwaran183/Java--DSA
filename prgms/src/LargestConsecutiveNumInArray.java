import java.util.Arrays;

public class LargestConsecutiveNumInArray {
    public static void main(String[] args){
        int[] arr = {5, 2, 99, 3, 4, 1, 100};
        int res = countOfLargestConsecutiveNumbers(arr);
        System.out.println(res);
    }

    private static int countOfLargestConsecutiveNumbers(int[] arr)
    {
        Arrays.sort(arr);
        int max = 0;
        int count= 1;
        for(int i=0; i<arr.length-1 ; i++)
        {
            if(arr[i]+1 == arr[i+1]) count++;
            else {
                if(count>max) max=count;
                count = 1;
            }
        }
        return max;
    }
}
