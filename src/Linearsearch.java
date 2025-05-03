public class Linearsearch {
    public static void main (String[] args) {
        int arr[] = {0, 1,2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 8;


        int result = ls(arr, target);
        if (result != -1) {
            System.out.println("element is found at:" + result);
        } else {
            System.out.println("element not found");
        }
    }


        public static int ls(int[] arr, int target){
            int size = arr.length;

            for (int i =0 ; i < size-1 ; i++) {
                if(arr[i]==target) {
                    return i;
                }
            }
            return -1;
        }
}

