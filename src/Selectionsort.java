public class Selectionsort {
    public static void main(String[] args){
        int arr[] = {2, 6, 3, 3, 1};
        ssort(arr);
    }

    public static void ssort(int[] arr){
        int size = arr.length;

        for(int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i); // Place smallest at front
        }

        for(int n : arr){
            System.out.print(n + " ");
        }
    }

    public static void swap(int[] arr , int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
