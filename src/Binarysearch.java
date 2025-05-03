
public class Binarysearch {
    public static void main (String[] args){
        int arr[] = {0,1,2,3,4,5,6,7,8,9};
        int target = 8;

        int res= bs(arr,target);
        System.out.println("element is found at:" + res);
    }

     static int bs(int[] arr, int target){
        int right = arr.length-1;
        int left =0;

        while (left < right){
            int mid = (left + right)/2;

            if(arr[mid]==target){
                return mid;
            }else if (arr[mid] < target){
                left = mid+1;
            }else {
                right = mid -1;
            }
        }
        return -1;

    }
}
