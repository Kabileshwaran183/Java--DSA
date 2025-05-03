public class Bubblesort {
    public static void main(String[] args){
        int arr[] = {2,6,3,9,1};
        bsort(arr);
    }

    public static void bsort(int[] arr){
        int size= arr.length;
        for(int i=0;i<size-1;i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j , j+1);
                }
            }
        }
        for(int n :arr){
            System.out.print(n + " ");
        }
    }
    public static void swap(int[] arr , int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
