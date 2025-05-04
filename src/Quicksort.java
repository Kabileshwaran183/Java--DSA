public class Quicksort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 5, 1, 2, 4};
        qsort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }

    public static void qsort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            qsort(arr, low, pi - 1);
            qsort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int i = low - 1;
        int pi = high;

        for (int j = low; j < high; j++)
        {
            if (arr[j] < arr[pi])
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr,pi, i+1);
        return i+1;
    }

    public static void swap(int[] arr , int a, int b)
    {
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b]=temp;
    }

}
