public class Linearsearch {
    public static void main (String[] args) {
        int arr[] = {0, 1,2, 3, 4};
        int target = 7;


        int result = ls(arr, target);


        if (result != -1) {
            System.out.println("element is found at:" + result);
        } else {
            System.out.println("element not found");
        }
    }


        public static int ls(int[] arr, int target){
            int size = arr.length;
            System.out.print(size);

            for (int i =0 ; i < size; i++) {
                if(arr[i]==target) {
                    return i;
                }
            }
            return -1;
        }
}

